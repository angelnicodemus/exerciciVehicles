package com.vehicles.project;

import javax.swing.JOptionPane;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception {
		checkDiameter(diameter);
		
		this.brand = brand;
		this.diameter = diameter;
	}
	
	public boolean equals(Wheel wheel) {
			return this.brand.equals(wheel.brand) && this.diameter == diameter;
	}

	public void checkDiameter(double diameter) throws Exception {
		
		if (diameter < 0.4 || diameter > 4 ) {
			
			;
			throw new Exception("torna a começar,no has introduït bé el diametre de les rodes ha de ser un numero entre 0.4 i 4");
		}
	}
	
}