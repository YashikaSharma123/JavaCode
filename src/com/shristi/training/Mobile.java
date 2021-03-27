package com.shristi.training;

public class Mobile {
	String name;
	int modelno;
	String compname;
	double price;
	public Mobile(String name,int modelno,String compname,double price) {
		this.name=name;
		this.modelno=modelno;
		this.compname=compname;
		this.price=price;
	}
	
	public void getDetails(){
		
		System.out.println(name+"\t"+modelno+"\t"+compname+"\t"+price);
	}
	public double showDidcountedPrice(int amount){
		double discount=price-amount;
		return discount;
	}}
	
	
