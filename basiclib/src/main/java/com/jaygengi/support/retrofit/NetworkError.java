package com.jaygengi.support.retrofit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;



/**
 * 描述：网络统一异常处理
 *
 * @author zhangqin
 * @date 2018/2/10
 */
public class NetworkError {

    /**
     * @param context 可以用于跳转Activity等操作
     */
    public static void error(Context context, Throwable throwable) {
        RetrofitException.ResponeThrowable responeThrowable = RetrofitException.retrofitException(throwable);
        // 此处可以通过判断错误代码来实现根据不同的错误代码做出相应的反应
        Bundle bundle = new Bundle();
        bundle.putInt("errorCode",responeThrowable.code);
//        context.startActivity(new Intent(context,ErrorActivity.class).putExtras(bundle));
//        switch (responeThrowable.code) {
//            case RetrofitException.ERROR.UNKNOWN:
//                break;
//            case RetrofitException.ERROR.PARSE_ERROR:
//                break;
//            case RetrofitException.ERROR.NETWORD_ERROR:
//                break;
//            case RetrofitException.ERROR.HTTP_ERROR:
//                break;
//            case RetrofitException.ERROR.SSL_ERROR:
//                Toast.makeText(context, responeThrowable.message, Toast.LENGTH_SHORT).show();
//                break;
//            case -1:
//                // 跳转到登陆页面
//                break;
//            default:
//                Toast.makeText(context, responeThrowable.message, Toast.LENGTH_SHORT).show();
//                break;
//        }
    }
}
