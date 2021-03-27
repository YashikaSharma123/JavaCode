package com.coforge.exceptions;
class Bank2{
		void withdraw(int amount) {
			System.out.println("In bank");
			try {
				int balance=100/amount;
				System.out.println("Balanace"+balance);
			}catch(ArithmeticException e) {
				System.out.println("Error.");
				throw e;
			}
			System.out.println("Server done");
		}
}

public class Throwbtwatmnbank {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			String value=args[0];
			//System.out.println("value"+value);
			int num=Integer.parseInt(value);
			System.out.println("Num"+num);
			Bank2 b=new Bank2();
			b.withdraw(num);
			System.out.println("Amount withdraw");
			}catch(Exception e) {
					System.out.println("system prblm");
					
				}
		System.out.println("Goodbye");
	}

	}

