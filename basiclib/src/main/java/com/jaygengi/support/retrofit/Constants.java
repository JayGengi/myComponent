package com.jaygengi.support.retrofit;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 描述：全局配置
 *
 * @author 张钦
 * @date 2017/9/25
 */
public class Constants {

    /**
     * BaseUrl
     */
    public static final String BASE_URL = "http://47.94.211.156:8091/HSH/";
    public static final String BASE_API = "api";

    /**
     * 一期代码
     */
    public static final String BASE_URL_V1 = "http://47.94.211.156:8088/zhidongwaimaiv2.0/";

    /**
     * 图片使用的服务器
     */
    public static final String IMG_URL = "http://47.94.211.156:6677";

    /**
     * 网络请求时长
     */
    public static final int HTTP_TIME = 5000;

    /**
     * 设备临时DeviceId
     */
    public static final String DEVICE_ID = UUID.randomUUID().toString();

    /**
     * 渠道ID（没有设置多渠道）
     */
    public static final String CHANNEL_ID = "10001";

    /**
     * 支付宝
     */
    public static final String A_LI_PAY_ID = "2088031960599129";
    public static final String A_LI_PAY_URL = BASE_URL + "/alipayBalance.do";
    public static final String A_LI_PAY_RES = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAMSjexxE9OHd4pvn0NkAew7SX1LDkmqmY8k6dWAu6FAscDynsObFd6B4biCDMzda9fRXy7Q4mmn8QwNryTdDotLT/oL1/pUa9LYj7qn3WggBLNOLeec1oGsXB9xSyY+rx+u9LJYDWx2klWsfaA+FrtgUANMB/7nSyz4f7KaqRgEVAgMBAAECgYEApdC1n8EGPvC8hnuUwWiGXJlJiKEidoyY2LdTAyiK/hB7FKrTocYiek8TjpcUOTma7dCbFf4lN/phCCF8K/387hEChq4cAbp6fCC0r95ZnDx7qQyMwG/+6mExv8gthvwNvIDy8u2vZNR9IBS6HNxkd9rJrqJfLV0jhT0ftFVwVAECQQDnZ3XVfxTdQMOsuPyt+80itvVsNDsrr57G2T4FHEajIvi2XrK8XHYU5VJR1aEV4BV3D7In7sAqjZVsh3asa+gJAkEA2YoLkUqoAwUTGXKsKShMQhx0/HwDgwz9FOgN86MimMerqHS1BoCR5rEv/jg5Q8apaq7468pXzYSA+Jj9DKdbrQJAbeC7m/+22YRaJZbFLJwHAPfdO17lxc2jWAppn6WYiPgfHwGCX1yMGUn2t7L3xVpc9ub2Em4Uw1/tVtZP7HlkeQJBAMmxVxZHrMzX+KRgkMS8KzAkqEasSKlJ8qBeowjgmSQkBMD0LB8yN5Q3djLzOAzh9ZQHVJ1xhsTy9I0Jc5020iUCQGbW0NKB9kUZPx+E0UloG73I92rO4yDvaDcCP2yDcOzTzbV3nDvAxUXjXq419T43hi09zwfnm05jhPfOhKydx2o=";

    /**
     * ========================================
     * ********        状态请求码        ********
     * ========================================
     */
    public static final int RESULT_CODE_1 = 101;
    public static final int RESULT_CODE_2 = 102;
    public static final int RESULT_CODE_3 = 103;
    public static final int RESULT_CODE_4 = 104;
    public static final int RESULT_CODE_5 = 105;
    public static final int RESULT_CODE_6 = 106;
    public static final int RESULT_CODE_7 = 107;
    public static final int RESULT_CODE_8 = 108;

    /**
     * ========================================
     * ********         通知ID          ********
     * ========================================
     */
    public static final String NOTI_CHANNEL_ID = "10001";
    public static final String NOTI_CHANNEL_NAME = "location";

    /**
     * ========================================
     * ********        sp文件key        ********
     * ========================================
     */
    public static final String UID = "uid";


    /**
     * =======================================
     * ********      EventBus标识      ********
     * =======================================
     */

    /**
     * 登陆成功
     */
    public static final int EVENT_1 = 205;
    /**
     * 退出登陆
     */
    public static final int EVENT_2 = 206;
    /**
     * 定位成功，一般普通事件
     */
    public static final int EVENT_3 = 207;

    /**
     * =======================================
     * ********        其他配置        ********
     * =======================================
     */

    /**
     * 状态栏高度
     */
    //TODO JayGengi
//    public static int STATUS_HEIGHT = ConvertUtils.dp2px(25);

    /**
     * 图片保存位置
     * <p>
     * TODO: 用的时候看下有没有这个目录
     * <p>
     * 判断目录是否存在，不存在则判断是否创建成功
     * FileUtils.createOrExistsDir(Constants.SAVE_REAL_PATH);
     */
    //TODO JayGengi
//    public static final String SAVE_REAL_PATH = SDCardUtils.getSDCardPaths().get(0) + "/HshLife";

    /**
     * 文件共享
     */
    public static final String FILE_PROVIDER = "com.ctrl.hshlife.fileprovider";

    /**
     * 上传文件表单
     */
    public static final String MULTIPART_FORM_DATA = "multipart/form-data";

    public static final String HEAD = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "    <head>\n" +
            "        <meta charset=\"UTF-8\">\n" +
            "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\">\n" +
            "        <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\n" +
            "        <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\n" +
            "        <meta content=\"telephone=no\" name=\"format-detection\">\n" +
            "        <title>商品详情</title>\n" +
            "        <style>\n" +
            "           body{ margin:0; border:0}\n" +
            "       </style>\n" +
            "    </head>\n" +
            "    <body>";

    public static final String END = "</body>\n" +
            "</html>";

    /**
     * 用用程序的key
     */
    public static String APPKEY = "appKey";//用用程序的key
    /**
     * 用用程序的key
     */
    public static String APPKEY_VALUE = "002";//用用程序的key
    /**
     * 密匙
     */
    public static String SECRET = "secret";//密匙
    /**
     * 密匙
     */
    public static String SECRET_VALUE = "abc";//密匙
    /**
     * 版本
     */
    public static String VERSION = "v";//版本
    /**
     * 版本
     */
    public static String VERSION_VALUE = "1.0";//版本
    /**
     * 输出格式 JSON
     */
    public static String FORMAT = "format";//输出格式 JSON
    /**
     * 输出格式 JSON
     */
    public static String FORMAT_VALUE = "JSON";//输出格式 JSON
    /**
     * 1:android  2:IOS  3:web
     */
    public static String TYPE = "type";//1:android  2:IOS  3:web
    /**
     * 1:android  2:IOS  3:web
     */
    public static String TYPE_VALUE = "1";//1:android  2:IOS  3:web
    /**
     * 方法名
     */
    public static String METHOD = "method";//方法名

    /**
     * 当前页数
     */
    public static int CURRENT_PAGE = 1;
    /**
     * 每页容量- 每页有多少条记录
     */
    public static int PAGE_CAPACITY = 10;

    public static final String REGEX = "^[A-Za-z0-9\\!\\@\\#\\$\\%\\^\\&\\*\\.\\~\\,\\@\\{\\}\\-\\=\\_\\+\\|\\;\\:\\/\\']{6,20}$";
    public static final String REGEX2 = "^[0-9]{6,20}$";
    public static final String CKEY = ",[AjiEWohgew/.?|";

    /**
     * 描述：系統參數
     *
     * @author JayGengi
     * @date 2018/7/17 0017 下午 4:40
     */
    public static Map<String, Object> getAllSystemParam() {
        Map<String, Object> params = new HashMap<>();
        params.put("appKey", APPKEY_VALUE);
        params.put("v", VERSION_VALUE);
        params.put("format", FORMAT_VALUE);
        params.put("type", TYPE_VALUE);
        return params;
    }

}
