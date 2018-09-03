package com.java.model.packageTours.model;

public class Location {
	// Địa Điểm Thăm Quan
	
	private int codeLocation;		// Mã địa điểm thăm quan
	private String nameLocation;	// Tên địa điểm thăm quan	
	
	public Location() {
		super();
	}
	public Location(int codeLocation, String nameLocation) {
		super();
		this.codeLocation = codeLocation;
		this.nameLocation = nameLocation;
	}
	public int getCodeLocation() {
		return codeLocation;
	}
	public void setCodeLocation(int codeLocation) {
		this.codeLocation = codeLocation;
	}
	public String getNameLocation() {
		return nameLocation;
	}
	public void setNameLocation(String nameLocation) {
		this.nameLocation = nameLocation;
	}
	

}
