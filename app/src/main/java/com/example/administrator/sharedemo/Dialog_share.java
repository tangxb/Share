package com.example.administrator.sharedemo;

import android.app.Dialog;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;



public class Dialog_share implements View.OnClickListener {

    private Dialog mDialog;
    private IShare mIShareListener;
//    private int mFlag=-1;

    private WeakReference<FragmentActivity> mWeakReference;
    public Dialog_share(FragmentActivity act, IShare shareListener){
        this.mIShareListener=shareListener;
        mWeakReference=new WeakReference(act);
        initView(act);
    }

    public void initView(FragmentActivity act){
        if(null ==act || act.getSupportFragmentManager().isDestroyed()){
            return;
        }
        mDialog = new Dialog(act, R.style.dialog);
        mDialog.setContentView(R.layout.pop_share);
        mDialog.findViewById(R.id.cancel_tv).setOnClickListener(this);
//        mDialog.findViewById(R.id.qq_ll).setOnClickListener(this);
//        mDialog.findViewById(R.id.xl_ll).setOnClickListener(this);
        mDialog.findViewById(R.id.closeView).setOnClickListener(this);
        mDialog.findViewById(R.id.lj_ll).setOnClickListener(this);

        mDialog.findViewById(R.id.weixin_ll).setOnClickListener(this);
        mDialog.findViewById(R.id.friend_ll).setOnClickListener(this);
//        mDialog.findViewById(R.id.space_ll).setOnClickListener(this);
        mDialog.setCanceledOnTouchOutside(true);
        Window win = mDialog.getWindow();
        win.setWindowAnimations(R.style.dialogWindowAnim); //设置窗口弹出动画
        WindowManager.LayoutParams lp = win.getAttributes();
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
    }

    public void show(){
        if(null != mDialog && !mDialog.isShowing() && null != mWeakReference.get()&& !mWeakReference.get().getSupportFragmentManager().isDestroyed()){
            mDialog.show();
        }
    }

    public void dismiss(){
        if(null != mDialog && mDialog.isShowing() && null != mWeakReference.get()
                && !mWeakReference.get().getSupportFragmentManager().isDestroyed()){
            mDialog.dismiss();
        }
    }
    @Override
    public void onClick(View v) {
        int flag=-1;
        switch (v.getId()){
//            case R.id.qq_ll:    //QQ
//                flag=2;
//                break;
            case R.id.weixin_ll://微信
                flag=3;
                break;
            case R.id.friend_ll:  //朋友圈
                flag=4;
                break;
//            case R.id.space_ll: //QQ空间
//                flag=5;
//                break;
//            case R.id.xl_ll:    //新浪
//                flag=6;
//                break;
            case R.id.lj_ll:    //链接
                flag=7;
                break;
        }
        if(flag!=-1)
        mIShareListener.onShareListener(flag);

        flag=-1;
        dismiss();
    }

    public interface IShare{
        void onShareListener(int flag);
    }
}
