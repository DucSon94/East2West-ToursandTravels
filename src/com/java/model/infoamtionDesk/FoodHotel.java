package com.java.model.infoamtionDesk;

public class FoodHotel {
	private int codeDishes;		// Mã món ăn
	private String dishName;	// Tên món ăn
	
	
	public FoodHotel() {
		super();
	}


	public FoodHotel(int codeDishes, String dishName) {
		super();
		this.codeDishes = codeDishes;
		this.dishName = dishName;
	}


	public int getCodeDishes() {
		return codeDishes;
	}


	public void setCodeDishes(int codeDishes) {
		this.codeDishes = codeDishes;
	}


	public String getDishName() {
		return dishName;
	}


	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	

}
