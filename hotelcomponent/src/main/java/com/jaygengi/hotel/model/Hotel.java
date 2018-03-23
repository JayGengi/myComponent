package com.jaygengi.hotel.model;

import android.os.Parcel;
import android.os.Parcelable;


/**
 * 酒店信息实体类
 * create by gengy 60167
 * at  18-3-22 上午10:37
 */
public class Hotel implements Parcelable {
	/*酒店名称*/
	private String hotelNm;
	/*酒店图片地址*/
	private String picturePath;
	/*酒店地址*/
	private String  hotelAddress;
	/*酒店地区*/
	private String regionNm;
	/*酒店星级*/
	private String hotelGradeNm;
	/*酒店价格*/
	private String hotelPrice;

	public String getHotelNm() {
		return hotelNm;
	}

	public void setHotelNm(String hotelNm) {
		this.hotelNm = hotelNm;
	}

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public String getRegionNm() {
		return regionNm;
	}

	public void setRegionNm(String regionNm) {
		this.regionNm = regionNm;
	}

	public String getHotelGradeNm() {
		return hotelGradeNm;
	}

	public void setHotelGradeNm(String hotelGradeNm) {
		this.hotelGradeNm = hotelGradeNm;
	}

	public String getHotelPrice() {
		return hotelPrice;
	}

	public void setHotelPrice(String hotelPrice) {
		this.hotelPrice = hotelPrice;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.hotelNm);
		dest.writeString(this.picturePath);
		dest.writeString(this.hotelAddress);
		dest.writeString(this.regionNm);
		dest.writeString(this.hotelGradeNm);
		dest.writeString(this.hotelPrice);
	}

	public Hotel() {
	}

	protected Hotel(Parcel in) {
		this.hotelNm = in.readString();
		this.picturePath = in.readString();
		this.hotelAddress = in.readString();
		this.regionNm = in.readString();
		this.hotelGradeNm = in.readString();
		this.hotelPrice = in.readString();
	}

	public static final Creator<Hotel> CREATOR = new Creator<Hotel>() {
		@Override
		public Hotel createFromParcel(Parcel source) {
			return new Hotel(source);
		}

		@Override
		public Hotel[] newArray(int size) {
			return new Hotel[size];
		}
	};
}