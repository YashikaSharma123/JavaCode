package com.coforge.exceptions;

class Bank{
	void withdraw(int amount) {
		System.out.println("in bank");
		int balance=1000/amount;
		System.out.println("Balance"+balance);
	}

}
public class Twoclassexcep  {
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
		
		}catch(Exception e) {
			System.out.println("Please try again");
		}
		System.out.println("Good bye");
	}

}
