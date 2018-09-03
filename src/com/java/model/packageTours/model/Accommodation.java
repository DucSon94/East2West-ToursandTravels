package com.java.model.packageTours.model;

public class Accommodation {
		// Chỗ ở
	private int codeAccommodation; 			// mã chỗ ở 
	private String nameAccommodation;		// Tên chỗ ở
	public Accommodation(int codeAccommodation, String nameAccommodation) {
		super();
		this.codeAccommodation = codeAccommodation;
		this.nameAccommodation = nameAccommodation;
	}
	public Accommodation() {
		super();
	}
	public int getCodeAccommodation() {
		return codeAccommodation;
	}
	public void setCodeAccommodation(int codeAccommodation) {
		this.codeAccommodation = codeAccommodation;
	}
	public String getNameAccommodation() {
		return nameAccommodation;
	}
	public void setNameAccommodation(String nameAccommodation) {
		this.nameAccommodation = nameAccommodation;
	}
	
}
