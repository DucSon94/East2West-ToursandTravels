package com.java.model.infoamtionDesk;

import java.util.Date;

public class Flights {
	private int flyingFlightCode;	 // mã chuyến bay;
	private String flightNames; 	 // tên chuyến bay
	private Date initializeTime; 	 // Thời gian khởi hành
	private Date endTime;			 //	Thời gian kết thúc;
	private float Cost; 			 //  Chi phí;
	public Flights() {
		super();
	}
	public Flights(int flyingFlightCode, String flightNames, Date initializeTime, Date endTime, float cost) {
		super();
		this.flyingFlightCode = flyingFlightCode;
		this.flightNames = flightNames;
		this.initializeTime = initializeTime;
		this.endTime = endTime;
		Cost = cost;
	}
	public int getFlyingFlightCode() {
		return flyingFlightCode;
	}
	public void setFlyingFlightCode(int flyingFlightCode) {
		this.flyingFlightCode = flyingFlightCode;
	}
	public String getFlightNames() {
		return flightNames;
	}
	public void setFlightNames(String flightNames) {
		this.flightNames = flightNames;
	}
	public Date getInitializeTime() {
		return initializeTime;
	}
	public void setInitializeTime(Date initializeTime) {
		this.initializeTime = initializeTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public float getCost() {
		return Cost;
	}
	public void setCost(float cost) {
		Cost = cost;
	}
	
	
}
