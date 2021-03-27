package com.shristi.training;

public class sample {
	public static void main(String[] args) {
//		int x=10;
//		long y=x*3;
//		float b=x+y;
//		double z=x+y*b;
//		double p=15.5;
//		float q=(float)20.9;
//		int r=(int)12;
		
int[][] marks=new int[2][2];

System.out.println(marks[0][1]);
marks[0][0]=90;
marks[0][1]=80;
marks[1][0]=70;
marks[1][1]=90;
System.out.println(marks[0][1]);
for(int i=0;i<marks.length;i++) {
	for(int j=0;j<2;j++) {
		System.out.println(marks[i][j]);
	}
}
System.out.println();
for(int[] row:marks)
	for(int val:row)
		System.out.println(val);
}

}
