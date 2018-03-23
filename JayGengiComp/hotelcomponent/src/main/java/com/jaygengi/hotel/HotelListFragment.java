package com.jaygengi.hotel;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.jaygengi.componentservice.eventbus.HotelData;
import com.jaygengi.hotel.model.Hotel;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 酒店Fragment
 * create by gengy 60167
 * at  18-3-21 下午5:17
 */

public class HotelListFragment extends Fragment {
    public static HotelListFragment instance = null;
    @BindView(R2.id.recyclerview)
    RecyclerView recyclerview;
    private View view;//当前界面布局
    private HotelListAdapter baseAdapter;
    private List<Hotel> hotelList = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.common_fragment_main, container, false);
        ButterKnife.bind(this, view);
        instance = this;
        EventBus.getDefault().register(this);
        setAdapter();
        loadData();
        return view;
    }
    /**
     * 加载数据
     * create by gengy 60167
     * at  18-3-21 下午5:19
     */
    private void loadData() {

        for(int i =0;i<5;i++){
            Hotel hotel = new Hotel();
            hotel.setHotelNm("沭阳大酒店"+i);
            hotel.setHotelAddress("沭阳迎宾大道"+i);
            hotel.setHotelGradeNm((i+1)+"星级");
            hotel.setHotelPrice(""+(i+1)*100);
            hotel.setRegionNm("沭阳东部");
//            hotel.setPicturePath("http://dimg10.c-ctrip.com/images/200v0n000000emais2A42_R_300_225.jpg");
            hotelList.add(hotel);
        }
        baseAdapter.setNewData(hotelList);
    }
    /**
     * 初始化适配器
     * create by gengy 60167
     * at  18-3-21 下午5:19
     */
    private void setAdapter(){
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        baseAdapter = new HotelListAdapter(hotelList);
        // 滑动最后一个Item的时候回调onLoadMoreRequested方法
        baseAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_BOTTOM);//列表动画
        /**
         * SCALEIN 缩放
         * SLIDEIN_BOTTOM 从下往上吸附
         * SLIDEIN_LEFT 从左往右
         * SLIDEIN_RIGHT 从右往左
         */
        recyclerview.setAdapter(baseAdapter);

    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void RfHotelData(HotelData hotel){
        hotelList.get(0).setHotelNm(hotel.getHotelNm());
        baseAdapter.setNewData(hotelList);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
