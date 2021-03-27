package com.coforge.interf;

public abstract class InMobile implements InterfaceDemo {
	public void peopleIns() {
		System.out.println("For Theft");
	}}
	class InCharger extends InMobile{

		@Override
		public void vehicleIns() {
			// TODO Auto-generated method stub
			System.out.println("Charging in vehicle");
		}
		
	}

