package com.coforge.interf;

public class InterDemo {
	public static void main(String[] args) {
		InterfaceDemo insur=new InVehicle();
		insur.peopleIns();
		insur.vehicleIns();
		insur=new InCharger();
		insur.peopleIns();
		insur.vehicleIns();
	}

}
