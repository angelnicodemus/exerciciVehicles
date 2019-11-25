package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;


import javax.swing.JOptionPane;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) throws Exception {
		checkPlate(plate);

		this.plate = plate;
		this.brand = brand;
		this.color = color;

	}

	public void checkPlate(String plate) throws Exception  {
		if(!plate.toLowerCase().matches("[0-9]{4}[a-z]{2,3}")) {
			
			JOptionPane.showMessageDialog(null, "torna a començar no has introduít be la matricula");
			throw new Exception();
			
		}
	}

	public void checkWheel(Wheel wheel) throws Exception {
		if (wheel == null) {
			JOptionPane.showMessageDialog(null, "has de introduir les rodes");
			throw new Exception();
		}
		
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addWheelsAxis(frontWheels);
		addWheelsAxis(backWheels);
	}

	public abstract void addWheelsAxis(List<Wheel> wheels) throws Exception;
}