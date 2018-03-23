package com.jaygengi.hotel.serviceimpl;

import android.support.v4.app.Fragment;

import com.jaygengi.componentservice.hotel.GetHotelListService;
import com.jaygengi.hotel.HotelListFragment;


/**
 * 接口的实现
 * create by gengy 60167
 * at  18-3-21 下午5:35
 */

public class HotelFragmentImlp implements GetHotelListService {

    @Override
    public Fragment GetHotelListFragment() {
        return new HotelListFragment();
    }
}
