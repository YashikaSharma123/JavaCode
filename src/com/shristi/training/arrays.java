package com.shristi.training;

public class arrays {
	public static void main(String[] args) {
		int[] marks=new int[4];
		//System.out.println(marks[3]);
		marks[0]=90;
		marks[1]=22;
		marks[2]=11;
		marks[3]=121;
		//System.out.print(marks[4]);
		System.out.print(marks[2]);
		/*
		int sum=0;
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
			sum+=marks[i];
		}
		System.out.print(sum);
		*/
		int sum=0;
		for(int num:marks) {
			sum+=num;
			System.out.print(sum);
		}
		
	}

}
