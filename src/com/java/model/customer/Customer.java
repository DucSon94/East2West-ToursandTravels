package com.java.model.customer;

import java.util.HashMap;
import java.util.Map;

import com.java.model.carRentals.CarRentaService;
import com.java.model.infoamtionDesk.Flights;
import com.java.model.infoamtionDesk.Hotel;
import com.java.model.packageTours.Tour;

public class Customer {
	// khách hàng
	private Map<CarRentaService,Integer> listCar = new HashMap<>();
	private Map<Tour,Integer> listTour = new HashMap<>();
	private Map<Hotel,Integer> listHotel = new HashMap<>();
	private Map<Flights,Integer> listFlights = new HashMap<>();
	
	public Customer() {
		super();
	}

	public Customer(Map<CarRentaService, Integer> listCar, Map<Tour, Integer> listTour, Map<Hotel, Integer> listHotel,
			Map<Flights, Integer> listFlights) {
		super();
		this.listCar = listCar;
		this.listTour = listTour;
		this.listHotel = listHotel;
		this.listFlights = listFlights;
	}

	public Map<CarRentaService, Integer> getListCar() {
		return listCar;
	}

	public void setListCar(Map<CarRentaService, Integer> listCar) {
		this.listCar = listCar;
	}

	public Map<Tour, Integer> getListTour() {
		return listTour;
	}

	public void setListTour(Map<Tour, Integer> listTour) {
		this.listTour = listTour;
	}

	public Map<Hotel, Integer> getListHotel() {
		return listHotel;
	}

	public void setListHotel(Map<Hotel, Integer> listHotel) {
		this.listHotel = listHotel;
	}

	public Map<Flights, Integer> getListFlights() {
		return listFlights;
	}

	public void setListFlights(Map<Flights, Integer> listFlights) {
		this.listFlights = listFlights;
	}
	
	
	

}
