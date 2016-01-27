package com.test;

public class ShapeArea implements Shape {
	
	@Override
	public void squareArea(int side) {
		int area = side*side;
		System.out.println("Area of square is "+ area);
	}

	@Override
	public void rectangleArea(int len, int br) {
		int area = len*br;
		System.out.println("Area of rectangle is "+ area);
	}
		

	@Override
	public void triangleArea(int a, int b, int c) {
		double temp= (a+b+c);
		double s= temp/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle is "+ area);
		System.out.println("value of s is "+ s);
		
	}

	@Override
	public void circleArea(int r) {
		double area = Math.PI*r*r;
		System.out.println("Area of circle is "+ area);
		
	}

}
