package com.example.administrator.sharedemo;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewConfiguration;



import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;


public class Utils {


    public static final SimpleDateFormat HHmm = new SimpleDateFormat("HH:mm");


    //解决精度问题
    public static double handlerDouble(double price){
        DecimalFormat df = new DecimalFormat("0.00");
        return Double.valueOf(df.format(price));
    }



    /**
     * 转换毫秒数成“分、秒”，如“01:53”。若超过60分钟则显示“时、分、秒”，如“01:01:30
     *
     * @param
     */
    public static String converLongTimeToStr(long time) {//7200
        int ss = 1000;
        int mi = ss * 60;
        int hh = mi * 60;

        long hour = (time) / hh;//=120
        long minute = (time - hour * hh) / mi;
        long second = (time - hour * hh - minute * mi) / ss;

        String strHour = hour < 10 ? "0" + hour : "" + hour;
        String strMinute = minute < 10 ? "0" + minute : "" + minute;
        String strSecond = second < 10 ? "0" + second : "" + second;
        if (hour > 0) {
            return strHour + ":" + strMinute + ":" + strSecond;
        } else {
            return strMinute + ":" + strSecond;
        }
    }

    /**
     * 得到屏幕宽度
     *
     * @return 宽度
     */
    public static int getScreenWidth(Activity activity) {
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int screenWidth = dm.widthPixels;
        return screenWidth;
    }

    /**
     * 得到屏幕高度
     *
     * @return 高度
     */
    public static int getScreenHeight(Activity activity) {
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int screenHeight = dm.heightPixels;
        return screenHeight;
    }

    /**
     * 根据手机的分辨率�?dp 的单�?转成�?px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }




    private static ConnectivityManager mConnectivityManager = null;

    private static ConnectivityManager getConnectivityManager(Context context) {
        if (mConnectivityManager == null) {
            mConnectivityManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
        }
        return mConnectivityManager;
    }




    public static boolean isTxtEmpty(String mobiles) {
       if(null==mobiles || "".equals(mobiles.trim())){
           return true;
       } else{
           return false;
       }

    }

    /**
     * 验证手机格式
     */
    public static boolean isMobile_NO(String mobiles) {
        if(null==mobiles || "".equals(mobiles.trim()) || !mobiles.startsWith("1") || mobiles.length() != 11)
            return true;
        else
            return false;
    }

    /**
     * 判断权限
     * @param context
     * @param permissions
     * @return
     */
    public static boolean isPermission(Context context, String[] permissions){
        boolean permission=true;
        for (int i=0;i<permissions.length;i++){
            if(ContextCompat.checkSelfPermission(context, permissions[i]) != PackageManager.PERMISSION_GRANTED){
                Log.v("wjw","=============false");
                permission=false;
                break;
            }
        }
            return permission;
    }


    //更改单个数据状态
    public static void upItemState(List<Boolean> list, int position){
        if(null==list)
            return;
        list.set(position,!list.get(position));
    }


    //初始化一个状态集合返回返回集合
    public static List<Boolean> initState(int length, boolean state){
        ArrayList<Boolean> status =new ArrayList<>();
        for (int i = 0; i< length; i++){
            status.add(state);
        }
        return status;
    }

    public static List<Boolean> upStateArray(List<Boolean> list, boolean state){
        if(null != list){
            for (int i = 0; i< list.size(); i++){
                list.set(i,state);
            }
            return list;
        }
        return new ArrayList<Boolean>();
    }





    /**
     * 将得到的int类型的IP转换为String类型
     * @param ip
     * @return
     */
    public static String intIP2StringIP(int ip) {
        return (ip & 0xFF) + "." +
                ((ip >> 8) & 0xFF) + "." +
                ((ip >> 16) & 0xFF) + "." +
                (ip >> 24 & 0xFF);
    }

    public  static String replaceMobile(String mobile){
        if(isTxtEmpty(mobile)){
            return "";
        }else{
            String substring1 = mobile.substring(0, 3);
            String substring2 = mobile.substring(7, mobile.length());
            return substring1 + "****" + substring2;
        }

    }


    public  static String randomInt(int length) {
        Random randGen=null;
        char[] numbersAndLetters=null;
        if (length < 1) {
            return null;
        }if (randGen == null) {
            randGen = new Random();
            numbersAndLetters = ("0123456789").toCharArray();
        }
        char [] randBuffer = new char[length];
        for (int i=0; i<randBuffer.length; i++) {
            randBuffer[i] = numbersAndLetters[randGen.nextInt(9)];
            //randBuffer[i] = numbersAndLetters[randGen.nextInt(9)];
        }
        return new String(randBuffer);
    }


    /**
     * 判断APP是否有安装
     * @param context
     * @param packagename
     * @return
     */
    public static boolean isAppInstalled(Context context, String packagename)
    {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packagename, 0);
        }catch (Exception e) {
            packageInfo = null;
            e.printStackTrace();
        }
        return packageInfo ==null?false:true;
    }



    /**
     * base64转为bitmap
     * @param base64Data
     * @return
     */
    public static Bitmap base64ToBitmap(String base64Data) {
        byte[] bytes = Base64.decode(base64Data, Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
    }

    /**
     * 通过年份和月份 得到当月的日子
     * @param year
     * @param month
     * @return
     */
    public static int getMonthDays(int year, int month) {
        month++;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
                    return 29;
                }else{
                    return 28;
                }
            default:
                return  -1;
        }
    }

    /**
     * 返回当前月份1号位于周几
     * @param year
     * 		年份
     * @param month
     * 		月份，传入系统获取的，不需要正常的
     * @return
     * 	日：1		一：2		二：3		三：4		四：5		五：6		六：7
     */
    public static int getFirstDayWeek(int year, int month){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }



    //获取虚拟按键的高度
    public static int getNavigationBarHeight(Context context) {
        int result = 0;
        if (hasNavBar(context)) {
            Resources res = context.getResources();
            int resourceId = res.getIdentifier("navigation_bar_height", "dimen", "android");
            if (resourceId > 0) {
                result = res.getDimensionPixelSize(resourceId);
            }
        }
        return result;
    }

    /**
     * 检查是否存在虚拟按键栏
     *
     * @param context
     * @return
     */
    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    public static boolean hasNavBar(Context context) {
        Resources res = context.getResources();
        int resourceId = res.getIdentifier("config_showNavigationBar", "bool", "android");
        if (resourceId != 0) {
            boolean hasNav = res.getBoolean(resourceId);
            // check override flag
            String sNavBarOverride = getNavBarOverride();
            if ("1".equals(sNavBarOverride)) {
                hasNav = false;
            } else if ("0".equals(sNavBarOverride)) {
                hasNav = true;
            }
            return hasNav;
        } else { // fallback
            return !ViewConfiguration.get(context).hasPermanentMenuKey();
        }
    }

    /**
     * 判断虚拟按键栏是否重写
     *
     * @return
     */
    private static String getNavBarOverride() {
        String sNavBarOverride = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            try {
                Class c = Class.forName("android.os.SystemProperties");
                Method m = c.getDeclaredMethod("get", String.class);
                m.setAccessible(true);
                sNavBarOverride = (String) m.invoke(null, "qemu.hw.mainkeys");
            } catch (Throwable e) {
            }
        }
        return sNavBarOverride;
    }



    /*****************************************百度API 查询号码归属地***********************************************/
    private  static String BAIDU_PHONE_URL = "http://mobsec-dianhua.baidu.com/dianhua_api/open/location?tel=";


    public static String getMobileURL(String mobile){
        return  BAIDU_PHONE_URL + mobile;

    }
    public static String getJsonFromURL(String urlStr) {
        StringBuilder sb = new StringBuilder();
        try {
            InputStream is = new URL(urlStr).openStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.v("wjw", "getJsonFromURL: " + sb.toString());
        return sb.toString();
    }


    public static String parseJsonToPhone(String url, String number) {
        JSONObject object = null;
        try {
            object = new JSONObject(url);
            JSONObject numberObj = object.getJSONObject("response").getJSONObject(number);
            //JSONObject detailObj = numberObj.getJSONObject("detail");

            //mLocation_tv.setText(numberObj.getString("location"));

            return numberObj.getString("location");


            //Log.v("wjw","detailObj.getString(province)============"+detailObj.getString("province"));
            //Log.v("wjw","numberObj.getString(location)============"+numberObj.getString("location"));
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }


}
