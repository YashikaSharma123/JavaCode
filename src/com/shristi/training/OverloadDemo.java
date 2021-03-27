package com.shristi.training;
class Shape{
void calArea(int x) {
	System.out.println("SQ"+(x*x));
}
void calArea(double x) {
	System.out.println("Circle"+Math.PI*x*x);
}
int calArea(int length,int breadth) {
	return (length*breadth);
}
double calArea(int length,double breadth) {
	return (0.5*length*breadth);
}
}

public class OverloadDemo {
	public static void main(String[] args) {
		System.out.println("main");
		Shape shape=new Shape();
		shape.calArea(12);
		shape.calArea(12.2);
		int rect=shape.calArea(20, 300);
		System.out.println(rect);
		double tri=shape.calArea(20,(int) 30.5);
		System.out.println(tri);
	}

}
