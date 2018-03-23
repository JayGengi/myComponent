package com.jaygengi.hotel.runalone.application;

import android.app.Application;

import com.jaygengi.componentlib.applicationlike.IApplicationLike;


public class HotelApplication implements IApplicationLike {

    @Override
    public void onCreate() {
//        Router.registerComponent("com.jaygengi.hotel.applike.HotelAppLike");
    }

    @Override
    public void onStop() {

    }

}