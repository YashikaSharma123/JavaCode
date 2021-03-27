package com.shristi.training;

import java.util.Scanner;

public class DemoOverload {
	public static void main(String[] args) {
		Employe e1=new Employe("yashika","manager");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Designation");
		String designation=sc.next();
		
		Employe e2=new Employe("Rani","programmer");
		Employe e3=new Employe("Priya","Director");
		if(designation.equals("Programmer")){
			System.out.println(e1.name);
			System.out.println(e1.calcBonus(10.2,20.2,30.1));
		}
		else if(designation.equals("Director")) {
			System.out.println(e2.name);
			System.out.println(e2.calcBonus(60.7));
		}
		else if(designation.equals("Manager")) {
			System.out.println(e3.name);
			System.out.println(e3.calcBonus(3.4,22.3));
		}
		else {
			System.out.println("wrong");
		}
	}

}
