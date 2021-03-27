package com.coforge.exceptions;





public class Multexcep {
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
		
		}catch(ArrayIndexOutOfBoundsException|NumberFormatException|ArithmeticException e){
			System.out.println("Please Enter a value greater than 0");
				}catch(Exception e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
					System.out.println("Please Enter a value greater than 0");
					
				}
		System.out.println("Completed");
	}

	}
