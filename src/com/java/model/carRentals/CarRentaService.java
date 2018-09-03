package com.java.model.carRentals;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CarRentaService {
	private Car car;			// ô tô
	private Date pickUpDate;	// thời gian khởi hành
	private Date dropOfDate;	// thời gian kết thúc
	private float costOfRentingACar; // tiền thuê xe
	public CarRentaService() {
		super();
	}
	public CarRentaService(Car car, Date pickUpDate, Date dropOfDate, float costOfRentingACar) {
		super();
		this.car = car;
		this.pickUpDate = pickUpDate;
		this.dropOfDate = dropOfDate;
		this.costOfRentingACar = costOfRentingACar;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Date getPickUpDate() {
		return pickUpDate;
	}
	public void setPickUpDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}
	public Date getDropOfDate() {
		return dropOfDate;
	}
	public void setDropOfDate(Date dropOfDate) {
		this.dropOfDate = dropOfDate;
	}
	public float getCostOfRentingACar() {
		return costOfRentingACar;
	}
	public void setCostOfRentingACar(float costOfRentingACar) {
		this.costOfRentingACar = costOfRentingACar;
	}
	
	public void hienThongTin() {
		car.hienThongTinXe();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String thoiGian1 = simpleDateFormat.format(pickUpDate);
		String thoiGian2 = simpleDateFormat.format(dropOfDate);
		System.out.println("Thoi gian bat dau: " +thoiGian1 + "\t Thoi gian ket thuc: " + thoiGian2 + "\t Gia thue: " + costOfRentingACar);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this ==obj) {
			return true;
		}if(obj == null) {
			return false;
		}if(getClass()!=obj.getClass()) {
			return false;
		}
		final CarRentaService car1 = (CarRentaService) obj;
		Car car2 = car1.getCar();
		//System.out.println(car.equals(car2));
		if(car!=car2) {
			return false;
		}if(pickUpDate!= car1.getPickUpDate()) {
			return false;
		}if(dropOfDate!= car1.getDropOfDate()) {
			return false;
		}if(costOfRentingACar!= car1.getCostOfRentingACar()) {
			return false;
		}
		return true;
	}

	

}
