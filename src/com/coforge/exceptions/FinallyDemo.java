package com.coforge.exceptions;

public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			String value=args[0];
			System.out.println("value"+value);
			int num=Integer.parseInt(value);
			System.out.println("Num"+num);
			int total=100/num;
			System.out.println("Total"+total);
			int[] marks=null;
			System.out.println(marks[2]);
		//	catch(Exception e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
	}finally {
		System.out.println("In Finally block");
		System.out.println("Clear resources");
			
		}
		System.out.println("Completed");
	}

}
