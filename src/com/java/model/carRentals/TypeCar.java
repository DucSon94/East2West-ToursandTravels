package com.java.model.carRentals;

public enum TypeCar {
		SMALLSIZE(1,"Small size"),FULLSIZE(2,"Full size"),LUXURIOUS(3,"Luxurious"),MINIVAN(4,"Mini van");
	
	private TypeCar(int typeCode, String typeName) {
		this.typeCode = typeCode;
		this.typeName = typeName;
	}
	public void hienThongTinLoaiXe() {
		System.out.println("Ma loai: " + typeCode +"\t Ten loai: " + typeName);
	}
	public int getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(int typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	private int typeCode;
	private String typeName;
	
	public static TypeCar getTypeCar(int loai) {
		switch(loai) {
		case 1:
			return TypeCar.SMALLSIZE;
		case 2:
			return TypeCar.FULLSIZE;
		case 3:
			return TypeCar.LUXURIOUS;
		case 4:
			return TypeCar.MINIVAN;
			default:
				return TypeCar.SMALLSIZE;
		}
		
	}
	
	

}
