package com.jaygengi.hotel;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jaygengi.hotel.model.Hotel;

import java.util.List;


/**
 * 酒店列表item数据
 * create by gengy 60167
 * at  18-3-22 上午9:45
 */
public class HotelListAdapter extends BaseQuickAdapter<Hotel, BaseViewHolder> {

    public HotelListAdapter(List<Hotel> datas) {
        super(R.layout.hotel_list_item, datas);
    }
    @Override
    protected void convert(BaseViewHolder holder, Hotel item) {
        try{
//            holder.setText(R.id.hotelPic,item.getPicturePath()); //酒店图片
            holder.setText(R.id.hotelNm,item.getHotelNm()); //酒店名
            holder.setText(R.id.hotelPrc,"¥"+item.getHotelPrice()); //酒店最低价格
            holder.setText(R.id.hotelRegion,item.getRegionNm()); //区域
            holder.setText(R.id.hotelGrade, item.getHotelGradeNm()); //星级
            holder.setText(R.id.hotelAdd, item.getHotelAddress()); //地址

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
