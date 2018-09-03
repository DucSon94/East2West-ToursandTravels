package com.java.model.infoamtionDesk;

public class City {
	private int cityCode;
	private String cityName;
	public City() {
		super();
	}
	public City(int cityCode, String cityName) {
		super();
		this.cityCode = cityCode;
		this.cityName = cityName;
	}
	public int getCityCode() {
		return cityCode;
	}
	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	

}
