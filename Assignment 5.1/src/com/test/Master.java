package com.test;
import java.util.Scanner;

public class Master {
	
	public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in);	
	System.out.println("Choose shape - triangle/rectangle");
	String input= keyboard.next();
	switch (input) {
	case "triangle":
		System.out.println("Enter values of sides");
		Triangle t = new Triangle();
		t.a= keyboard.nextInt();
		t.b= keyboard.nextInt();
		t.c= keyboard.nextInt();
		System.out.println("Area of triangle is "+ t.getArea());
		keyboard.close();
		break;

	case "rectangle":
		System.out.println("Enter values of sides");
		Rectangle r = new Rectangle();
		r.len= keyboard.nextInt();
		r.br= keyboard.nextInt();
		System.out.println("Area of rectangle is "+ r.getArea());
		keyboard.close();
		break;
			
	}
	
		
		
	}

}
