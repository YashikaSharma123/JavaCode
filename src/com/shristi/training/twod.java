package com.shristi.training;

public class twod {
	public static void main(String[] args) {
    int [][]marks=new int[3][];
	marks[0]=new int[2];
	marks[1]=new int[3];
	marks[2]=new int[4];

	//System.out.println(marks[0][1]);
	marks[0][0]=90;
	marks[0][1]=80;
	marks[1][0]=70;
	marks[1][1]=90;
	marks[1][2]=90;
	marks[2][0]=70;
	marks[2][1]=22;
	marks[2][2]=99;
	marks[2][3]=12;
	//System.out.println(marks[0][1]);
	for(int i=0;i<marks.length;i++) {
		for(int j=0;j<marks[i].length;j++) {
			System.out.println(marks[i][j]+"\t");
		}
	}
	System.out.println();
	for(int[] row:marks)
		for(int val:row)
			System.out.println(val+"\t");
	}


}

