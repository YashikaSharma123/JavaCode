package com.shristi.training;

import java.util.Scanner;

public class Scannerarray {
	public static void main(String[] args) {
		System.out.println("Enter Total count");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n);
		int[]marks=new int[n];
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
			
			//System.out.println();
			
			
		}
//		for(int i=0;i<no;i++) {
//			System.out.println(marks[i]);
//		}
		int sum1=0;
		for(int val:marks) {
			
			sum1+=val;
			
		}
		System.out.println("sum"+sum1);
		System.out.println("avg"+(sum1/n));

	}

}
