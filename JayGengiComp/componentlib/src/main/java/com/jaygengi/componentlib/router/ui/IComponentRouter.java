package com.jaygengi.componentlib.router.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;


public interface IComponentRouter {

    /**
     * 打开一个链接
     *
     * @param url
     *          目标url可以是http 或者 自定义scheme
     * @param bundle
     *          打开目录activity时要传入的参数。建议只传基本类型参数。
     * @return 是否正常打开
     */
    boolean openUri(Context context, String url, Bundle bundle);

    boolean openUri(Context context, Uri uri, Bundle bundle);

    boolean verifyUri(Uri uri);
}
