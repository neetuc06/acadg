package com.test;

public class Triangle extends Shape {
	
	int a, b, c;
	
	public double getArea(){
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
		
	}

}
