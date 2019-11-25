package com.vehicles.project;


import java.util.ArrayList;
import java.util.List;


import javax.swing.JOptionPane;

public class Main {


	public static void generateVehicle(String BikeOrCar) throws Exception {
		
		while (!BikeOrCar.equals("c") && !BikeOrCar.equals("m")) {
			BikeOrCar= JOptionPane.showInputDialog("quin tipus de vehicle vols registar 'c' per a un cotxe 'm' per a una moto");
			
		}
		Vehicle vehicle = enterInfo(BikeOrCar.toLowerCase());
		addWheels(vehicle);
	}
	
	public static void main(String[] args) throws Exception {

		String BikeOrCar = " ";
		generateVehicle(BikeOrCar);
			
	}

	
	
	

	public static Vehicle enterInfo(String BikeOrCar) throws Exception {
		

		
		String plate = JOptionPane.showInputDialog("Introdueix la matricula? (la matrícula ha de tenir 4 números i dues o tres lletres.)").toLowerCase();
		

		String brand = JOptionPane.showInputDialog("Intordueix la marca del vehicle");

		
		String color = JOptionPane.showInputDialog("Intordueix el color del vehicle");
		
		
		if (BikeOrCar.equals("c")) {
			return new Car(plate, brand, color);
			
			
		} else {
			return new Bike(plate, brand, color);
			
		}
	
	}
			
	public static void addWheels(Vehicle vehicle) throws Exception {
		List<Wheel> frontWheel = askWheelAxis(vehicle, "devantera");
		List<Wheel> backWheel = askWheelAxis(vehicle, "trassera");

		vehicle.addWheels(frontWheel, backWheel);
	}

	public static List<Wheel> askWheelAxis(Vehicle vehicle, String axis) throws Exception {

		List<Wheel> wheels = new ArrayList<Wheel>();

		if (vehicle instanceof Car) {
			Wheel Rwheel = askWheel(" dreta", axis);

			Wheel Lwheel = askWheel(" esquerra", axis);

			wheels.add(Rwheel);
			wheels.add(Lwheel);

		} else {
			Wheel BWheel = askWheel("", axis);
			wheels.add(BWheel);
		}
		return wheels;

	}

	public static Wheel askWheel(String frontRearLeftRigth, String axis) throws Exception {

		String brandWheel = JOptionPane.showInputDialog("Introdueix la marca de la roda " + axis + frontRearLeftRigth+  " ?");

		
		double diameterWheel=Double.parseDouble(JOptionPane.showInputDialog("Introdueix el diàmetre de la roda "+ axis + frontRearLeftRigth+ " ?"));
		
        
		Wheel wheel1 = new Wheel(brandWheel, diameterWheel);
		

		return wheel1;
		
		
		
		}

		
	}
