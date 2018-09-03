package com.java.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.java.model.carRentals.Car;
import com.java.model.carRentals.CarRentaService;
import com.java.model.carRentals.TypeCar;

public class Test {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setAirConditioner(true);
		car1.setDriverRequired(true);
		car1.setType(TypeCar.FULLSIZE);
		car1.setSeatHealing(4);
		car1.setCarCode(1);
		car1.setNameModel("HonDa");
		car1.hienThongTinXe();
		CarRentaService carRentaService1 = new CarRentaService();
		carRentaService1.setCar(car1);
		Date date1 =new Date();
		Date date2 = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date1 = formatter.parse("18/08/2018");
			date2 = formatter.parse("18/08/2018");
			carRentaService1.setPickUpDate(date1);
			carRentaService1.setDropOfDate(date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		carRentaService1.setCostOfRentingACar(100);
		carRentaService1.hienThongTin();
		System.out.println("-----------------------------------");
		Car car2 = new Car();
		car2.setAirConditioner(true);
		car2.setDriverRequired(true);
		car2.setType(TypeCar.FULLSIZE);
		car2.setSeatHealing(4);
		car2.setCarCode(1);
		car2.setNameModel("HonDa");
		car2.hienThongTinXe();
		CarRentaService carRentaService2 = new CarRentaService();
		carRentaService2.setCar(car2);
		Date date3 =new Date();
		Date date4 = new Date();
		//SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date3 = formatter.parse("18/08/2018");
			date4 = formatter.parse("18/08/2018");
			carRentaService2.setPickUpDate(date3);
			carRentaService2.setDropOfDate(date4);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		carRentaService2.setCostOfRentingACar(100);
		carRentaService2.hienThongTin();
		System.out.println("------------------------------------------------");
		Map<CarRentaService, Integer> danhSach = new HashMap<>();
		danhSach.put(carRentaService1, 1);
		danhSach.put(carRentaService2, 1);
		Set<Map.Entry<CarRentaService,Integer>> danhSachSet = danhSach.entrySet();
		for (Entry<CarRentaService, Integer> entry : danhSachSet) {
			System.out.println("Key: ") ;
			entry.getKey().hienThongTin();
			System.out.print("\t value: " + entry.getValue());
			
		}
		System.out.println("car1: "+carRentaService1.hashCode());
		System.out.println("car2: "+carRentaService2.hashCode());
		Integer a=5;
		Integer b=5;
		System.out.println("hashcode a: "+a.hashCode()+ "\thascode b: " + b.hashCode());
		System.out.println("hashcode car1: " + car1.hashCode() + "\t hashcode car2: " + car2.hashCode());
		System.out.println("----------------");
		System.out.println(carRentaService1.equals(carRentaService2));
		//carRentaService1.equals(carRentaService2);
		System.out.println(car1.equals(car2));
	}

}
