package com.coforge.interf;

public class InVehicle  implements InterfaceDemo{
	String name;
	double price;
	@Override
	public void vehicleIns() {
		// TODO Auto-generated method stub
		System.out.println("Bike");
	}

	@Override
	public void peopleIns() {
		// TODO Auto-generated method stub
		System.out.println("For medical Insurance");
	}

}
