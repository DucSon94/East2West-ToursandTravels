package com.java.model.infoamtionDesk;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private int hotelCode;		// mã khách sạn;
	private String hotelName;	//	Tên khách sạn;
	private City city;			// thành phố
	private List<FoodHotel> listFood = new ArrayList<>();
	private float price; 		// mức giá;
	

}
