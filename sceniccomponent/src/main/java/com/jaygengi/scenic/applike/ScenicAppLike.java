package com.jaygengi.scenic.applike;


import com.jaygengi.componentlib.applicationlike.IApplicationLike;
import com.jaygengi.componentlib.router.Router;
import com.jaygengi.componentservice.scenic.GetScenicListService;
import com.jaygengi.scenic.serviceimpl.ScenicFragmentImlp;

/**
 * 想要使用组件对外的服务，必须先注册
 * create by gengy 60167
 * at  18-3-21 下午5:35
 */

public class ScenicAppLike implements IApplicationLike {

    Router router = Router.getInstance();

    @Override
    public void onCreate() {
        router.addService(GetScenicListService.class.getSimpleName(), new ScenicFragmentImlp());
    }

    @Override
    public void onStop() {
        router.removeService(GetScenicListService.class.getSimpleName());
    }
}
