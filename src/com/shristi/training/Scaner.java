package com.shristi.training;

import java.util.Scanner;

public class Scaner {
public static void main(String[] args) {
	System.out.println("Enter details");
	Scanner sc=new Scanner(System.in);
//System.out.println("Enter details");
	String name=sc.next();
	System.out.println(name);
	String namee=sc.nextLine();
	System.out.println(namee);
	int id=sc.nextInt();
	System.out.println(id);
	sc.nextLine();
	String city=sc.nextLine();
	System.out.println(city);
	double sal=sc.nextDouble();
	System.out.println(sal);
	sc.close();
	
}
}
