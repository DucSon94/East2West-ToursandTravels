package com.java.model.packageTours;

import java.util.ArrayList;
import java.util.Date;

import com.java.model.packageTours.model.Accommodation;
import com.java.model.packageTours.model.Food;
import com.java.model.packageTours.model.LocalTravel;
import com.java.model.packageTours.model.Location;

public class Tour {
	private ArrayList<Location> listOfParametersReference =new ArrayList<>(); //  dánh sách các địa điểm tham quan;
	private ArrayList<Accommodation> listAccommodation = new ArrayList<>(); // danh sách các chỗ ở
	private ArrayList<Food> listFood = new ArrayList<>(); // danh sách các món ăn
	private ArrayList<LocalTravel> listLocalTravel =new ArrayList<>(); // danh sách các địa phương tham quan;
	private float costForTravel; // chí phí cho chuyến du lịch
	private Date startTime; // 		Thời gian bắt đầu
	private Date endTime;	//		Thời gian kết thúc
	public Tour() {
		super();
	}
	public ArrayList<Location> getListOfParametersReference() {
		return listOfParametersReference;
	}
	public void setListOfParametersReference(ArrayList<Location> listOfParametersReference) {
		this.listOfParametersReference = listOfParametersReference;
	}
	public ArrayList<Accommodation> getListAccommodation() {
		return listAccommodation;
	}
	public void setListAccommodation(ArrayList<Accommodation> listAccommodation) {
		this.listAccommodation = listAccommodation;
	}
	public ArrayList<Food> getListFood() {
		return listFood;
	}
	public void setListFood(ArrayList<Food> listFood) {
		this.listFood = listFood;
	}
	public ArrayList<LocalTravel> getListLocalTravel() {
		return listLocalTravel;
	}
	public void setListLocalTravel(ArrayList<LocalTravel> listLocalTravel) {
		this.listLocalTravel = listLocalTravel;
	}
	

	

}
