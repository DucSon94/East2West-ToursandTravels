package com.java.model.carRentals;

import java.util.Date;

public class Car {
	
	private String nameModel;			// Tên mãu xe vd: HonDa Civic....
	private int carCode;				// Mã Xe ô tô
	private TypeCar type;				// Loại Xe : xe kích thước nhỏ, xe sang trọng...
	private int seatHealing;			// Số ghê ngồi của xe
	private boolean driverRequired;		// Có người lái hoặc không
	private boolean airConditioner;		// Có điều hào hoặc không
	//private Date pickUpDate;
	//private Date dropOfDate;
	public Car() {
		super();
	}
	public Car(String nameModel, int carCode, TypeCar type, int seatHealing, boolean driverRequired,
			boolean airConditioner) {
		super();
		this.nameModel = nameModel;
		this.carCode = carCode;
		this.type = type;
		this.seatHealing = seatHealing;
		this.driverRequired = driverRequired;
		this.airConditioner = airConditioner;
	}
	public String getNameModel() {
		return nameModel;
	}
	public void setNameModel(String nameModel) {
		this.nameModel = nameModel;
	}
	public int getCarCode() {
		return carCode;
	}
	public void setCarCode(int carCode) {
		this.carCode = carCode;
	}
	public TypeCar getType() {
		return type;
	}
	public void setType(TypeCar type) {
		this.type = type;
	}
	public int getSeatHealing() {
		return seatHealing;
	}
	public void setSeatHealing(int seatHealing) {
		this.seatHealing = seatHealing;
	}
	public boolean isDriverRequired() {
		return driverRequired;
	}
	public void setDriverRequired(boolean driverRequired) {
		this.driverRequired = driverRequired;
	}
	public boolean isAirConditioner() {
		return airConditioner;
	}
	public void setAirConditioner(boolean airConditioner) {
		this.airConditioner = airConditioner;
	}
	
	public void hienThongTinXe() {
		System.out.println("Ma xe: " + carCode + "\t Ten xe: " + nameModel + "\t Loai xe: " + type.getTypeName()+"\t So ghe ngoi: " + seatHealing +
				"\t Dieu hoa: " +airConditioner+ "\t Co nguoi lai: " +driverRequired );
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) {
			return true;
		}if(obj==null) {
			return false;
		}
		final Car car = (Car)obj;
		if(nameModel!= car.getNameModel()) {
			return false;
		}if(carCode!= car.getCarCode()) {
			return false;
		}if(type!= car.getType()) {
			return false;
		}if(seatHealing!= car.getSeatHealing()) {
			return false;
		}if(driverRequired!=car.isDriverRequired()) {
			return false;
		}if(airConditioner!= car.isAirConditioner()) {
			return false;
		}
		return true;
	}
	
	
	

}
