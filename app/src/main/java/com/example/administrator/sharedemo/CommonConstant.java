package com.example.administrator.sharedemo;

/**
 * Created by Administrator on 2016/7/25.
 * 常量
 */
public class CommonConstant {

    public interface IUserConstant{
        String ROOT_PASSWORD_FILE_NAME      = "root_password";		   //保存用户账号密码 文件名
        String USER_ROOT_KEY = "root";		   //账号 文件名
        String USER_PASSWORD_KEY = "password";		   //密码 文件名
        String USER_ID_KEY = "user_id";		   //UserId

    }
    public interface IRequestURL{


        String REQUEST_URL_O2O = "http://112.74.205.98:8085/";  //O2O路径


      //  String REQUEST_URL = "http://app.jb020.com/";    //正式服务器
       String REQUEST_URL = "http://120.79.106.60:8071/";      //测试环境
//        String REQUEST_URL = "http://192.168.1.18:8071/";    //本地服务




    }


    public interface IRequestCode{


        int ACTION_QUERY_REGION = 0;        //查询地区
        int ACTION_QUERY_REGION_BASI_DATA = 1;        //查询地区


        int ACTION_ADDRESS_ADD = 2;     //添加地址
        int ACTION_ADDRESS_UP = 3;     //修改地址
        int ACTION_ADDRESS_LIST = 4;     //地址列表
        int ACTION_ADDRESS_DELETE = 5;     //地址删除
        int ACTION_ADDRESS_SET_DEFAULT = 6;     //设置默认



        int ACTION_ATTENTION_PRODUCT_LIST = 10;  //商品关注列表
        int ACTION__ATTENTION_PRODUCT_LIST_LOAD = 11;  //商品关注列表
        int ACTION__ATTENTION_PRODUCT_DELETE = 12;  //商品关注删除


        int ACTION__ATTENTION_STOP_LIST = 20;  //店铺关注列表
        int ACTION__ATTENTION_STOP_LIST_LOAD = 21;  //店铺关注列表
        int ACTION__ATTENTION_STOP_DELETE = 22;  //店铺关注删除Visit


        int ACTION__ATTENTION_VISIT_LIST = 30;  //游览记录关注列表
        int ACTION__ATTENTION_VISIT_LIST_LOAD = 31;  //游览记录关注列表
        int ACTION__ATTENTION_VISIT_DELETE = 32;  //店铺关注删除



        int ACTION_BALANCE_QUERY = 35;  //余额查询
        int ACTION_BALANCE_INFO = 36;  //余额信息
        int ACTION_BALANCE_EXCHANGE = 37; //余额提现


        int ACTION_BALANCE_INCOME_LIST = 38;    //余额收益
        int ACTION_BALANCE_INCOME_LIST_LOAD = 39;    //余额收益

        int ACTION_BALANCE_LIST = 40;  //余额列表
        int ACTION_BALANCE_LIST_LOAD = 41;  //余额列表

        int ACTION_BALANCE_EXCHANGE_LIST = 42;  //提现列表
        int ACTION_BALANCE_EXCHANGE_LIST_LOAD = 43;  //提现列表


        int ACTION_BALANCE_SUFFICIENT_LIST = 44;  //余额充值列表
        int ACTION_BALANCE_SUFFICIENT_LIST_LOAD = 45;  //余额充值列表


        int ACTION__SEND_CODE = 46;  //发送验证码
        int ACTION__SEND_CODE_BASIDATA = 47;  //发送验证码
        int ACTION__SEND_CODE_BASIDATA_PHONE = 48;  //发送验证码




        int ACTION_BANK_INFO_LIST = 50;
        int ACTION_BANK_ADD = 51;
        int ACTION_BANK_DELETE = 52;
        int ACTION_BANK_LIST = 53;
        int ACTION_BANK_UP = 54;

        int ACTION_USER_INFO = 60;  //用户信息
        int ACTION_USER_INFO_SEX_UP = 61;
        int ACTION_USER_INFO_HEAD_UP = 62;
        int ACTION_USER_INFO_ADDRESS_UP = 63;
        int ACTION_USER_INFO_NAME_UP = 64;
        int ACTION_USER_INFO_MAILBOX_UP = 65;
        int ACTION_USER_INFO_PHONE_UP = 66;
        int ACTION_USER_INFO_UN_PHONE_UP = 67;





        int ACTION_PRODUCT_CLASSIFY_LIST = 70;  //商品分类列表
        int ACTION_PRODUCT_CLASSIFY_LIST_LOAD = 71;  //商品分类列表
        int ACTION_PRODUCT_ATTRIBUTE_LIST = 72;  //商品分类列表

        int ACTION_DISCOUNT_DETAILS = 79;  //优惠卷详情
        int ACTION_DISCOUNT_DETAILS_GET = 80;  //获取优惠卷
        int ACTION_DISCOUNT_MINE_LIST = 81;  //优惠卷列表
        int ACTION_DISCOUNT_PAGE_GET = 82;  //获取优惠卷
        int ACTION_DISCOUNT_LIST = 83;  //优惠卷列表
        int ACTION_DISCOUNT_MINE = 84;  //优惠卷我的列表





        int ACTION_GAME_ORDER_LIST = 90;  //游戏
        int ACTION_GAME_ORDER_LIST_LOAD = 91;  //游戏
        int ACTION_GAME_TOOL_LIST = 92;  //游戏
        int ACTION_GAME_TOOL_LIST_LOAD = 93;  //游戏
        int ACTION_GAME_CREATE_ORDER = 94;  //游戏
        int ACTION_GAME_ORDER_DETAILS = 95;  //游戏


        int ACTION_GENERALIZE_LIST = 100;   //风口


        int ACTION_INTEGRAL_PRODUCT_INFO = 110; //积分商品信息
        int ACTION_INTEGRAL_PRODUCT_LIST = 111; //积分列表
        int ACTION_INTEGRAL_PRODUCT_LIST_LOAD = 112; //积分列表
        int ACTION_INTEGRAL_PRODUCT_BENNER = 113; //积分轮播图
        int ACTION_INTEGRAL_PRODUCT_ADD = 114; //添加
        int ACTION_INTEGRAL_PRODUCT_CANCEL= 115; //取消
        int ACTION_INTEGRAL_RECORD= 116; //记录



        int ACTION_INTEGRAL_BALANCE = 120;  //积分余额
        int ACTION_INTEGRAL_BALANCE_DETAIL = 121;  //积分余额

        int ACTION_SYSTEM_DISTRBUTION_LIST = 130;
        int ACTION_SYSTEM_DISTRBUTION_LIST_LOAD = 131;


        int ACTION_DISCOUNT_COUNT = 132;
        int ACTION_BANK_COUNT = 133;

        int ACTION_LOTTERY_INFO = 135;  //开奖信息


        int ACTION_MEDICAL_LIST = 136;  //
        int ACTION_MEDICAL_LIST_LOAD = 137;  //
        int ACTION_MEDICAL_ADD = 138;  //
        int ACTION_MEDICAL_CANCEL = 139;  //


        int ACTION_INTEGRAL_LIST = 145;  // 积分记录
        int ACTION_INTEGRAL_LIST_LOAD = 146;  //


        int ACTION_MINE_PROFIT_LIST = 150;  //我的积分记录
        int ACTION_MINE_PROFIT_LIST_LOAD = 151;  //我的积分记录


        int ACTION_MINE_MINSUPPLIER_LIST = 155;  //我的供应商



        int ACTION_MOVIE_COMMENT_COUNT = 160;    //视频评论数量
        int ACTION_MOVIE_COMMENT_LIST = 161;    //视频评论列表
        int ACTION_MOVIE_COMMENT_LIST_LOAD = 162;    //视频评论列表

        int ACTION_MOVIE_INFO = 163;    //视频信息
        int ACTION_MOVIE_COMMON_LIST = 164;    //视频商品列表
        int ACTION_MOVIE_HOME_LIST = 165;    //视频商品列表
        int ACTION_MOVIE_PRODUCT_LIST = 166;    //视频商品列表
        int ACTION_MOVIE_PRODUCT_LIST_LOAD = 167;    //视频商品列表
        int ACTION_MOVIE_MSG = 168;    //视频商品列表

        int ACTION_MSG_DETAILS = 175;    //消息詳情
        int ACTION_MSG_LIST = 176;    //消息詳情
        int ACTION_MSG_DELETE = 177;    //消息詳情

        int ACTION_MSGSEE_DELIVERY = 180;    //消息詳情

        int ACTION_O2O_HOME_LIST = 190;    //o2o
        int ACTION_O2O_HOME_LIST_LOAD = 191;    //o2o
        int ACTION_O2O_HOME_STOP_LIST = 192;    //o2o
        int ACTION_O2O_PRODUCT_EVALUATE_LIST = 193;    //o2o
        int ACTION_O2O_PRODUCT_EVALUATE_LIST_LOAD = 194;    //o2oO2oHome
        int ACTION_O2O_STORE_MSG = 195;    //o2o
        int ACTION_O2O_STORE_NEW_LIST = 196;    //o2o
        int ACTION_O2O_STORE_NEW_HOST = 197;    //o2o

        //综合商城订单
        int ACTION_ORDER_ALL_LIST = 210;    //全部订单
        int ACTION_ORDER_ALL_CANCEL = 211;    //全部订单->取消
        int ACTION_ORDER_ALL_SEND_WARN = 212;    //全部订单->提醒
        int ACTION_ORDER_ALL_SIGN_IN = 213;    //全部订单->签收

        int ACTION_ORDER_DETAIL_CANCEL = 220;    //全部订单详情->取消
        int ACTION_ORDER_DETAIL_SEND_WARN = 221;    //全部订单详情->提醒
        int ACTION_ORDER_DETAIL_SIGN_IN = 222;    //全部订单详情->签收

        int ACTION_ORDER_EVALUATE_ADD = 223;    //订单评价添加



        //积分订单
        int ACTION_ORDER_INTEGRAL_ALL_LIST = 250;    //全部订单
        int ACTION_ORDER_INTEGRAL_SEND_WARN = 251;    //全部订单->提醒
        int ACTION_ORDER_INTEGRAL_SIGN_IN = 252;    //全部订单->签收
        int ACTION_ORDER_INTEGRAL_PAY = 253;    //全部订单->支付


        int ACTION_ORDER_DETAIL_INTEGRAL_CANCEL = 254;    //全部订单详情->取消
        int ACTION_ORDER_DETAIL_INTEGRAL_SEND_WARN = 255;    //全部订单详情->提醒
        int ACTION_ORDER_DETAIL_INTEGRAL_SIGN_IN = 256;    //全部订单详情->签收

        int ACTION_ORDER_DETAIL_INTEGRAL_PAY = 257;    //全部订单->支付
        int ACTION_ORDER_INTEGRAL_EVALUATE_ADD = 258;    //全部订单->支付



        //退货 积分商品
        int ACTION_ORDER_INTEGRAL_RETURN_DETAILS = 265;    //退货详情
        int ACTION_ORDER_INTEGRAL_RETURN_SAVE = 266;    //退货信息保存
        int ACTION_ORDER_INTEGRAL_RETURN_LIST = 267;    //退货列表
        int ACTION_ORDER_INTEGRAL_RETURN_LIST_LOAD = 268;    //退货列表
        int ACTION_ORDER_INTEGRAL_RETURN_CANCEL = 269;    //退货列表

        int ACTION_ORDER_INTEGRAL_RETURN_PARAMETER = 270;    //退货参数
        int ACTION_ORDER_INTEGRAL_RETURN_APPLY_FOR = 271;    //退货参数


        // 退货 综合商品
        int ACTION_ORDER_RETURN_DETAILS = 272;    //退货详情
        int ACTION_ORDER_RETURN_PARAMETER = 273;    //退货参数
        int ACTION_ORDER_RETURN_APPLY_FOR = 274;    //退货申请
        int ACTION_ORDER_RETURN_SAVE = 275;    //退货信息保存
        int ACTION_ORDER_RETURN_LIST = 276;    //退货列表
        int ACTION_ORDER_RETURN_LIST_LOAD = 277;    //退货列表
        int ACTION_ORDER_RETURN_CANCEL = 278;    //退货取消





        //O2O订单
        int ACTION_ORDER_O2O_CANCEL = 280;
        int ACTION_ORDER_O2O_EVALUATE_ADD = 281;



        //支付
        int ACTION_QUERY_DEFAULT_ADDRESS = 290; //默认地址

        int ACTION_ORDER_CREATES = 300;  //综合商品订单创建
        int ACTION_FREIGHT_COUNT = 301;  //运费计算
        int ACTION_ORDER_TOGETERBUY_CREATE = 302;  //团购订单创建
        int ACTION_ORDER_O2O_CREATES = 303;  //O2O订单创建

        //支付签名
        int ACTION_PAY_SIGN_ZFBS = 310;
        int ACTION_PAY_SIGN_WXS = 311;
        int ACTION_PAY_BALANCES = 312;


        //综合商品详情
        int ACTION_PRODUCT_DETAILS = 320;
        int ACTION_PRODUCT_DETAILS_ADD_GWC = 321;


        //店铺
        int ACTION_SUPPLIER_BANNER = 330;
        int ACTION_SUPPLIER_PRODUCT_COUNT = 331;
        int ACTION_SUPPLIER_STATE = 332;
        int ACTION_SUPPLIER_ATTENTION_ADD = 333;
        int ACTION_SUPPLIER_ATTENTION_CANCEL = 334;

        int ACTION_SYSTEM_USER_CODE = 340;


        int ACTION_LOGIN_SEND_CODE = 350;
        int ACTION_LOGIN_UP_PSWD = 351;
        int ACTION_PAY_SEND_CODE = 352;
        int ACTION_PAY_UP_PSWD = 353;

        int ACTION_RETRIEVE_SEND_CODE = 354;
        int ACTION_RETRIEVE_QUERY_USER = 355;
        int ACTION_RETRIEVE_PSWD = 356;

        int ACTION_RANKINGS = 360;
        int ACTION_RANKINGS_DETAILS = 361;
        int ACTION_RECOMMEND_PERSON_INFO = 362;


        int ACTION_SEARCH_HOT_SEEK = 370;

        int ACTION_SUPPLIER_TYPE_DATA = 375;
        int ACTION_SUPPLIER_INFO = 376;

        int ACTION_SUPPLIER_TYPE_ENTERF1 = 377;
        int ACTION_SUPPLIER_TYPE_INITMSG1 = 378;
        int ACTION_SUPPLIER_TYPE_INITMSG1_ADDRESS = 379;


        int ACTION_SUPPLIER_TYPE_ENTERF2 = 380;
        int ACTION_SUPPLIER_TYPE_INITMSG2_SEND = 381;



        int ACTION_SUPPLIER_INVITATION_DATA = 382;
        int ACTION_SUPPLIER_INVITATION_ADDRESS = 383;


        int ACTION_PRODUCT_TOGETERBUY_EVALUATE = 390;
        int ACTION_PRODUCT_TOGETERBUY_INFO = 391;


        int ACTION_USER_CODES = 392;


        int ACTION_HOME_CATEGORY_LIST = 400;
        int ACTION_HOME_MINE_CODE = 401;
        int ACTION_HOME_MINE_BALANCE = 402;
        int ACTION_HOME_MINE_RECORD_AMOUNT = 403;
        int ACTION_HOME_MINE_PRODUCT_STATU_AMOUNT = 404;
        int ACTION_HOME_MINE_MSG_COUNT = 405;
        int ACTION_HOME_MINE_O2O_STATU_AMOUNT = 406;
        int ACTION_HOME_MINE_SUPPLIER_MSG = 407;


        int ACTION_HOME_020_LIST = 410;
        int ACTION_HOME_CATEGORA = 411;
        int ACTION_HOME_BANNER_TOGETER_BUY = 412;
        int ACTION_HOME_BANNER_TOP = 413;
        int ACTION_HOME_ACTIVITY = 414;
        int ACTION_HOME_AREA_ZERO = 415;
        int ACTION_HOME_MODULE_CATEGORY_MSG = 416;
        int ACTION_HOME_BANNER_LOVELIFE = 417;
        int ACTION_HOME_BANNER_LOVESHARE = 418;
        int ACTION_HOME_BANNER_RECOMMEND = 419;
        int ACTION_HOME_BANNER_MORE = 420;
        int ACTION_HOME_HOME_LIST = 421;
        int ACTION_HOME_HOME_LIST_LOAD = 422;


        int ACTION_HOME_SHOPPING_VEHICLE_LIST = 430;
        int ACTION_HOME_SHOPPING_VEHICLE_UP = 431;
        int ACTION_HOME_SHOPPING_VEHICLE_DELETE = 432;

        int ACTION_ORDER_EVALUATE_LIST = 450;
        int ACTION_ORDER_INTEGRALEVALUATE_LIST = 451;
        int ACTION_ORDER_INTEGRAL_PAY_PAY = 452;
        int ACTION_ORDER_INTEGRAL_PAY_LIST = 453;
        int ACTION_ORDER_INTEGRAL_PAY_CANCEL = 454;

        int ACTION_ORDER_INTEGRAL_SHIPMENTS_LIST = 455;
        int ACTION_ORDER_INTEGRAL_RECEIVE_SIGN_IN = 456;
        int ACTION_ORDER_INTEGRAL_RECEIVE_LIST = 457;
        int ACTION_ORDER_INTEGRAL_SHIPMENTS_SEND_WARN = 458;


        int ACTION_ORDER_O2O_EVALUATE_LIST = 460;
        int ACTION_ORDER_O2O_PAY_LIST = 461;
        int ACTION_ORDER_O2O_PAY_CANCEL = 462;


        int ACTION_ORDER_PAY_LIST = 470;
        int ACTION_ORDER_PAY_CANCEL = 471;
        int ACTION_ORDER_RECEIVE_LIST = 472;
        int ACTION_ORDER_RECEIVE_SIGN_IN = 473;

        int ACTION_ORDER_SHIPMENTS_LIST = 474;
        int ACTION_ORDER_SHIPMENTS_SEND_WARN = 475;


        int ACTION_PRODUCT_EVALUATE_LIST = 480;
        int ACTION_PRODUCT_EVALUATE_LIST_LOAD = 481;

        int ACTION_PRODUCT_CORD = 482;
        int ACTION_PRODUCT_ATTENTION_ADD = 483;
        int ACTION_PRODUCT_ATTENTION_CANCEL = 484;


        int ACTION_REGISTER_REGISTER = 490;
        int ACTION_REGISTER_SEND_CODE = 491;


        int ACTION_STORE_ALL_LIST = 500;
        int ACTION_STORE_ALL_LIST_LOAD = 501;
        int ACTION_STORE_NEW_LIST = 502;

        int ACTION_SYSTEM_ALL_LIST = 510;
        int ACTION_SYSTEM_B_LIST = 511;
        int ACTION_SYSTEM_C_LIST = 512;
        int ACTION_SYSTEM_D_LIST = 513;


        int ACTION_TOGETER_PRODUCR_ATTENTION_CANCEL = 520;
        int ACTION_TOGETER_PRODUCR_ATTENTION_ADD = 521;
        int ACTION_TOGETER_EVALUATE_LIST = 522;
        int ACTION_TOGETER_EVALUATE_LIST_LOAD = 523;


        int ACTION_INTEGRAL_DEFAULT_ADS = 530;
        int ACTION_INTEGRAL_PRODUCT_EXCHANGE = 531;
        int ACTION_INTEGRAL_PRODUCT_BALANCE = 532;
        int ACTION_INTEGRAL_ORDER_CREATE = 533;


        int ACTION_VIDEO_COMPLETE_GET = 540;
        int ACTION_VIDEO_COMPLETE_EVALUATION = 541;

        int ACTION_GUIDE_IMAGE = 542;


        int ACTION_717_PRODUCT_LIST = 550;
        int ACTION_717_PRODUCT_LIST_LOAD = 551;
        int ACTION_MY_CLOUD = 552;


        int QHS_TITLE_LIST = 553;


        int ACTION_QHX_CREATE_ORDER = 560;



        int ACTION_SUPPLIER_WAREHOUSE_LIST = 561;   //获取供应商豆仓库列表
        int ACTION_USER_SUPPLIER_EARNINGS_RECORD_LIST = 562;   //获取供应商对应的个人收益纪录
        int ACTION_USER_SUPPLIER_EARNINGS_RECORD_LIST_LOAD = 563;   //获取供应商对应的个人收益纪录


        int ACTION_LOTTERY_SUPPLIER__LIST = 570;   //抽奖供应商的列表




        //签到规则
        int SIGN_REGULATION = 575;
        int SIGN_EARNINGS_RECORD_LIST = 576;
        int SIGN_EARNINGS_RECORD_LIST_LOAD = 577;
        int SIGN_USER = 578;    //用户签到
        int SIGN_USER_RECORD = 579;    //用户签到记录

        int QI_HUA_SUAN_ENTER = 580;    //企划算入驻
        int QI_HUA_SUAN_QUERY_INFO = 581;    //企划算入驻    信息查询


        int  RECHARGE= 582;    //充值   手机充值
        int  RECHARGE_RECORD= 583;    //充值   手机充值
        int  RECHARGE_RECORD_LOAD= 584;    //充值   手机充值




        int ACTION_AUTO_LOGIN = -1;       //自动登陆唯一标识，避免重复自动登陆
        int ACTION_LOGIN = -2;       //登陆唯一标识，避免重复自动登陆





        int IMAGE_UP_LOAD = 9999;       //图片上传



    }





    public static final String APP_KEY      = "2867822706";		   // 应用的APP_KEY


    public static final String REDIRECT_URL = "http://www.sina.com";// 应用的回调页
    public static final String SCOPE =
            "email,direct_messages_read,direct_messages_write,"
                    + "friendships_groups_read,friendships_groups_write,statuses_to_me_read,"
                    + "follow_app_official_microblog," + "invitation_write";


    public static final String APP_ID="wxbc752ea40874289f";






    // 0到10   普通参数
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;



    //通知码
    public static final int USER_HEAD = 500;
    public static final int USER_SEX = 501;
    public static final int USER_NAME = 502;
    public static final int USER_MAILBOX = 503;
    public static final int USER_PHONE = 504;



    //定制新增
    public static final int COMMENT_UP = 600;//评价图片上传
    public static final int QUERY_ALLORDER_LIST = 601;//查询全部
    public static final int QUERY_ALLORDER_LIST_LOAD = 602;//查询全部更多
    public static final int QUERY_ORDER_DAIFUKUAN_LIST = 603;//查询待付款
    public static final int QUERY_ORDER_DAIFUKUAN_LIST_LOAD = 604;//查询待付款更多
    public static final int QUERY_ORDER_DAIFUKUAN_LIST_CANCEL = 605;//取消订单
    public static final int QUERY_ORDER_DAIBUKUAN_LIST = 606;//待补款
    public static final int QUERY_ORDER_DAIBUKUAN_LIST_LOAD = 607;//查询待补款更多

    public static final int QUERY_ORDER_DAIFAHUO_LIST = 608;//待发货
    public static final int QUERY_ORDER_DAIFAHUO_LIST_LOAD = 609;//查询待发货更多
    public static final int QUERY_ORDER_REMIND = 610;//提醒发货
    public static final int APPLY_ORDERREFUND = 611;//申请退款

    public static final int QUERY_ORDER_DAISHOUHUO_LIST = 612;//待收货
    public static final int QUERY_ORDER_DAISHOUHUO_LIST_LOAD = 613;//查询待收货更多
    public static final int ORDER_SHOUHUO = 614;//确认收货

    public static final int QUERY_ORDER_COMMENT_LIST = 615;//待评价
    public static final int QUERY_ORDER_COMMENT_LIST_LOAD = 616;//查询待评价更多
    public static final int QUERY_ORDER_COMMENT = 617;//提交评价
    public static final int QUERY_LOGISTICS = 618;//查询物流信息

    public static final int SELECT_AFTERSALEORDER = 619;//查询售后
    public static final int SELECT_AFTERSALEORDER_LOAD = 620;//查询售后更多
    public static final int CANCLE_APPLYREFUND = 621;//取消申请

    public static final int REFUND_DETAIL = 622;//退款详情
    public static final int GET_ALLEXPRESS = 623;//查询快递

    public static final int APPLY_ORDERREFUND_TWO = 624;//申请退款(退款详情保存)
    public static final int ORDER_DELETE = 625;//删除订单

    public static final int GET_ORDERDETAIL_BYNO = 626;//根据订单编号查看订单详情

    //精选,限时抢购
    public static final int GET_SECKILL_HOME = 627;//首页秒杀
    public static final int GET_ALLCURRENTDATETIMESPLIT = 628;//获取秒杀活动时间分段列表
    public static final int GET_ALLSECKILLS = 629;//获取秒杀活动详情

    //寻宝
    public static final int DEFAULT_GET_NEWPERIODICAL = 630;//获取当前未开奖的期数及奖品
    public static final int LOTTERY_GETRULE = 630;//中奖规则
    public static final int BEAN_STATISTICS = 631;//获取抽奖统计数
    public static final int ADD_BEANLOTTERY_RECORD = 632;//参与抽奖
    public static final int GET_USERWINNING_RECORD = 633;//中奖纪录
    public static final int GET_USERWINNING_RECORD_LOAD = 634;//中奖纪录加载更多
    public static final int GET_PRIZE = 635;//领奖




    /**App状态**/
    public static final int STATUS_FORCE_KILLED = -2; //应用放在后台被强杀了
    public static final int STATUS_NORMAL = 2;  //APP正常态

}
