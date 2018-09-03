package com.java.model.infoamtionDesk;

import java.util.ArrayList;

public class InfomatonDesk {
	// quầy thông tin
	private ArrayList<Flights> listFlight =new ArrayList<>();
	private ArrayList<Hotel> listHotel = new ArrayList<>();
	public InfomatonDesk() {
		super();
	}
	public InfomatonDesk(ArrayList<Flights> listFlight, ArrayList<Hotel> listHotel) {
		super();
		this.listFlight = listFlight;
		this.listHotel = listHotel;
	}
	public ArrayList<Flights> getListFlight() {
		return listFlight;
	}
	public void setListFlight(ArrayList<Flights> listFlight) {
		this.listFlight = listFlight;
	}
	public ArrayList<Hotel> getListHotel() {
		return listHotel;
	}
	public void setListHotel(ArrayList<Hotel> listHotel) {
		this.listHotel = listHotel;
	}
	
	

}
