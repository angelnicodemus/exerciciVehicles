package com.vehicles.project;

import java.util.List;

import javax.swing.JOptionPane;



public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}

	public void addWheelsAxis(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 1)
			JOptionPane.showMessageDialog(null, "has de introduír minim una roda");
			

		Wheel wheel = wheels.get(0);

		checkWheel(wheel);
		

		this.wheels.add(wheel);

		throw new Exception();
   }
}