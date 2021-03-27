package com.coforge.exceptions;
import java.util.Scanner;
class BankN{
	int balance;
	public BankN(int balance) {
		super();
		this.balance=balance;
	}
	void withdraw(int amount) throws OutOfLimitException,NegBalException{
		{ 
		if((balance-amount)<=0) {
			throw new NegBalException("balance is neg");
		}else if(amount>5000){
			throw new OutOfLimitException("amount should be less");
		}else {
			balance=balance-amount;
			System.out.println(balance);
		}
		}
	}
}

public  class UserdefException {
	public static void main(String[] args)
		{
			System.out.println("Welcome");
			Scanner sc=new Scanner(System.in);
			int amount=sc.nextInt();
			BankN ban=new BankN(9000);
			System.out.println("amount"+amount);
			try {
				ban.withdraw(amount);
				System.out.println("Amount withdraw");
			}
				
			catch(OutOfLimitException e) {
				System.out.println(e.getMessage());
			}catch(NegBalException e) {
			System.out.println(e.getMessage());
		}
			System.out.println("Good bye");
}
}
