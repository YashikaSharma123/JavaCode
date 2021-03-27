package com.shristi.training;

public class MobileDemo {
	public static void main(String[] args) {
		
	
	Mobile mob=new Mobile("samsung",111,"n8",98);
//	mob.name="Note8";
//	mob.modelno=121;
//	mob.compname="Mi";
//	mob.price=1212;
	System.out.println("discount "+mob.name+"\t"+mob.modelno+"\t"+mob.compname+"\t"+mob.price);
	mob.getDetails();
	
	double amt=mob.showDidcountedPrice(1000);
	System.out.println("amount "+amt);
	System.out.println();
	
	Mobile mob1=new Mobile("ni",1,"apple",1211);
//	mob1.name="Note9";
//	mob1.modelno=1221;
//	mob1.compname="Apple";
//	mob1.price=1212;
	System.out.println("discount "+mob1.showDidcountedPrice(1000));
	
	System.out.println(mob1.name+"\t"+mob1.modelno+"\t"+mob1.compname+"\t"+mob1.price);
}


}
