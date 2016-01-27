package com.test;

public class Shape {
	
	public void area(int a){
		int area = a*a;
		System.out.println("Area of square is"+ area);
	}
	

	public void area(int a, int b){
		int area = a*b;
		System.out.println("Area of rectangle is"+ area);
	}
	
	
	public void area(int a, int b, int c){
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle is"+ area);
	}
	
	
	
	
	
	

}
