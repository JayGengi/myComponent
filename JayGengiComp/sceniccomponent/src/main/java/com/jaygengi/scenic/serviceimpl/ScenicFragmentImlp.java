package com.jaygengi.scenic.serviceimpl;

import android.support.v4.app.Fragment;

import com.jaygengi.componentservice.hotel.GetHotelListService;
import com.jaygengi.componentservice.scenic.GetScenicListService;
import com.jaygengi.scenic.ScenicListFragment;


/**
 * 接口的实现
 * create by gengy 60167
 * at  18-3-21 下午5:35
 */

public class ScenicFragmentImlp implements GetScenicListService {

    @Override
    public Fragment GetScenicListFragment() {
        return new ScenicListFragment();
    }
}
