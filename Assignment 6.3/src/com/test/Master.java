package com.test;
import java.util.Scanner;

public class Master extends ShapeArea {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Choose shape - circle/ triangle/ square/ rectangle");
		String input = keyboard.next();
		switch (input) {
		case "circle":
			ShapeArea sh= new ShapeArea();
			System.out.println("Enter radius");
			sh.circleArea(keyboard.nextInt());
			break;
			
		case "triangle":
			ShapeArea sh2= new ShapeArea();
			System.out.println("Enter value of sides");
			sh2.triangleArea(keyboard.nextInt(), keyboard.nextInt(), keyboard.nextInt());
			break;
			
		case "square":
			ShapeArea sh3= new ShapeArea();
			System.out.println("Enter side");
			sh3.squareArea(keyboard.nextInt());
			break;
			
		case "rectangle":
			ShapeArea sh4= new ShapeArea();
			System.out.println("Enter length, breadth");
			sh4.rectangleArea(keyboard.nextInt(), keyboard.nextInt());
			break;

		default:
			System.out.println("Invalid input");
			break;
		}
	}
	
	
	
	
	
}
