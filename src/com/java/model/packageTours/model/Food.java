package com.java.model.packageTours.model;

public class Food {
		// thực phẩm
	private int codeFood;		// Mã món ăn 
	private String nameFood;	// Tên món ăn
	public Food(int codeFood, String nameFood) {
		super();
		this.codeFood = codeFood;
		this.nameFood = nameFood;
	}
	public Food() {
		super();
	}
	public int getCodeFood() {
		return codeFood;
	}
	public void setCodeFood(int codeFood) {
		this.codeFood = codeFood;
	}
	public String getNameFood() {
		return nameFood;
	}
	public void setNameFood(String nameFood) {
		this.nameFood = nameFood;
	}
	
}
