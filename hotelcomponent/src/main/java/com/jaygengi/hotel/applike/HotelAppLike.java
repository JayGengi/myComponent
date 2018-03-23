package com.jaygengi.hotel.applike;


import com.jaygengi.componentlib.applicationlike.IApplicationLike;
import com.jaygengi.componentlib.router.Router;
import com.jaygengi.componentservice.hotel.GetHotelListService;
import com.jaygengi.hotel.serviceimpl.HotelFragmentImlp;

/**
 * 想要使用组件对外的服务，必须先注册
 * create by gengy 60167
 * at  18-3-21 下午5:35
 */

public class HotelAppLike implements IApplicationLike {

    Router router = Router.getInstance();

    @Override
    public void onCreate() {
        router.addService(GetHotelListService.class.getSimpleName(), new HotelFragmentImlp());
    }

    @Override
    public void onStop() {
        router.removeService(GetHotelListService.class.getSimpleName());
    }
}
