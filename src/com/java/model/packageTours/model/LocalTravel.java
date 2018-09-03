package com.java.model.packageTours.model;

public class LocalTravel {
	private int codeLocalTravel;		// Mã địa phương
	private String nameLocalTravel;		// Tên địa phương	
	public LocalTravel(int codeLocalTravel, String nameLocalTravel) {
		super();
		this.codeLocalTravel = codeLocalTravel;
		this.nameLocalTravel = nameLocalTravel;
	}
	public LocalTravel() {
		super();
	}
	public int getCodeLocalTravel() {
		return codeLocalTravel;
	}
	public void setCodeLocalTravel(int codeLocalTravel) {
		this.codeLocalTravel = codeLocalTravel;
	}
	public String getNameLocalTravel() {
		return nameLocalTravel;
	}
	public void setNameLocalTravel(String nameLocalTravel) {
		this.nameLocalTravel = nameLocalTravel;
	}
	

}
