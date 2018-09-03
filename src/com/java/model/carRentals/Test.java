package com.java.model.carRentals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Date date1 =new Date();
		Date date2 = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date1 = formatter.parse("18/08/2018");
			date2 = formatter.parse("18/08/2018");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Car2 car1 =new Car2("Honda", 1, TypeCar.FULLSIZE, 4, true, true, date1, date2);
		Car2 car2 =new Car2("Honda", 1, TypeCar.FULLSIZE, 4, true, true, date1, date2);
		System.out.println(car1.equals(car2));
		Map<Car2, Integer> danhSachCar = new HashMap<>();
		danhSachCar.put(car1, 5);
		danhSachCar.put(car2, 6);
		Set<Map.Entry<Car2,Integer>> danhSachSet = danhSachCar.entrySet();
		for (Entry<Car2, Integer> entry : danhSachSet) {
			System.out.println("key: " + entry.getKey() + "\t value: " + entry.getValue());
		}
	}

}
