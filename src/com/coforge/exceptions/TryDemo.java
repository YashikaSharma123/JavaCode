package com.coforge.exceptions;

public class TryDemo {
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
		
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please Enter a value");
			}catch(NumberFormatException e) {
				System.out.println("Plaese enter a number");
				}catch(ArithmeticException e) {
			System.out.println("Plaese enter a nu greater than 0");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Completed");
	}

}
