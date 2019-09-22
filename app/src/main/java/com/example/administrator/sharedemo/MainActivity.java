package com.example.administrator.sharedemo;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import java.lang.ref.WeakReference;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainActivity extends FragmentActivity implements View.OnClickListener, Dialog_share.IShare {

    private TextView sharebtn;
    private WeakReference mWeakReference;
    private Dialog_share mDialog_share;
    private IWXAPI wxApi;
    private Subscription mSubscribe;
     Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWeakReference = new WeakReference(this);
        wxApi = WXAPIFactory.createWXAPI(this, CommonConstant.APP_ID);
        wxApi.registerApp(CommonConstant.APP_ID);
        sharebtn = findViewById(R.id.share_btn);
        sharebtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(null==mDialog_share){
            mDialog_share = new Dialog_share(this,this);
        }
        mDialog_share.show();
    }

    @Override
    public void onShareListener(int flag) {
        switch (flag) {
            case CommonConstant.TWO:      //QQ
//                shareMsgQQ("url",0);
                break;

            case CommonConstant.FIVE:   //QQ空间
//                shareMsgQQ("url",1);
                break;

            case CommonConstant.THREE:  //微信
                shareMsgWx("url",0);
                break;

            case CommonConstant.FOUR:   //朋友圈
                shareMsgWx("url",1);
                break;

            case CommonConstant.SIX:   //新浪
//                if (null != mWeakReference.get()){
//                    mWeakReference.get().accredit(null);
//                }

                break;

            case CommonConstant.SEVEN:   //链接
                sharelJ();
                break;
        }
    }

    /**
     *
     *
     * 分享信息到微信
     * @param flag  分享的标识
     * @param type  分享的类型
     */

    private void shareMsgWx(String type, final int flag){
        if (!wxApi.isWXAppInstalled()) {
            ViewUtils.showHint(this,"您还未安装微信客户端",Toast.LENGTH_SHORT);
            return;
        }
        //创建请求对象
        final SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = String.valueOf(System.currentTimeMillis());
        req.scene = flag==CommonConstant.ZERO?SendMessageToWX.Req.WXSceneSession:SendMessageToWX.Req.WXSceneTimeline;

        if("image".equals(type)){       //分享纯图片
            WXImageObject imgObj = new WXImageObject();
//            imgObj.setImagePath(mFilePath);
            WXMediaMessage msg = new WXMediaMessage();
            msg.mediaObject = imgObj;
            req.message = msg;
            wxApi.sendReq(req);
        }else if("url".equals(type)){   //分享链接
            if(null==mParameter){
                return;
            }
            //异步处理
            mSubscribe = Observable.create(new Observable.OnSubscribe<String>() {
                @Override
                public void call(Subscriber<? super String> subscriber) {
                    bitmap = ViewUtils.getBitmap(mParameter.getLogoUrl());
                    if(null==bitmap) {
                        return;
                    }
                    subscriber.onNext("");
                    subscriber.onCompleted();
                }

            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<String>() {
                @Override
                public void call(String s) {
                    WXWebpageObject webpage = new WXWebpageObject();
                    webpage.webpageUrl = Utils.isTxtEmpty(mParameter.getShareUrl())?"http://www.jb020.com/":mParameter.getShareUrl();
                    WXMediaMessage msg = new WXMediaMessage(webpage);
                    msg.title = mParameter.getItemName();
                    Bitmap scaledBitmap = Bitmap.createScaledBitmap(bitmap, 60, 60, true);//压缩Bitmap
                    msg.setThumbImage(scaledBitmap);
                    req.message = msg;
                    wxApi.sendReq(req);
                }
            });
        }
    }
    public ResponsePayBean mParameter;   //页面数据对象
    private void sharelJ() {
        ClipboardManager clip = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        clip.setText(Utils.isTxtEmpty(mParameter.getShareUrl())?"http://www.jb020.com/":mParameter.getShareUrl()); // 复制
        ViewUtils.showHint(this, "复制链接成功，可以分享给朋友啦", Toast.LENGTH_SHORT);
    }
}
