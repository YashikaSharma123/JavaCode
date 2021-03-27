package com.coforge.exceptions;
class Bank1{
	void withdraw(int amount) throws Exception {
		System.out.println("In bank");
		try {
			if(amount>1000) {
				System.out.println("amt is less");
				throw new Exception("amount should be less than 0");
			}else {
			int balance=100/amount;
			System.out.println("Balanace"+balance);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error."+e.getMessage());
			throw e;
		}finally {
			System.out.println("close resources");
		}
		System.out.println("Server done");
	}
}

public class ThrowsDemo {
public static void main(String[] args) {
	

	System.out.println("Welcome");
	try {
		String value=args[0];
		//System.out.println("value"+value);
		int num=Integer.parseInt(value);
		System.out.println("Num"+num);
		Bank1 b=new Bank1();
		b.withdraw(num);
		System.out.println("Amount withdraw");
		}catch(Exception e) {
				System.out.println("system prblm"+e.getMessage());
				
			}
	System.out.println("Goodbye");


}}


