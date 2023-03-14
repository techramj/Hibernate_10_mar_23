package com.seed.main;

import com.seed.entity.Bike;
import com.seed.entity.Car;
import com.seed.entity.Truck;
import com.seed.entity.Vehicle;

public class Application {
	
	public static void main(String[] args) {
		Car bmw = new Car();
		Bike bike = new Bike();
		
		signal(bmw,"red");
		signal(bike,"green");
		
		Truck truck = new Truck();
		signal(truck,"red");
	}
	
	public static void signal(Vehicle vehicle, String color) {
		if("red".equalsIgnoreCase(color)) {
			vehicle.stop();
		}
		
		if("green".equalsIgnoreCase(color)) {
			vehicle.start();
		}
		
	}
	
	

}
