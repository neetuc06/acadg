package com.test;
import java.util.Scanner;

public class Master {
	
	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
		
	System.out.println("Choose shape - triangle/ square/rectangle");
	String input= keyboard.next();
	switch (input) {
	case "triangle":
		Shape sh= new Shape();
		System.out.println("Enter values of sides");
		int a=keyboard.nextInt();
		int b=keyboard.nextInt();
		int c=keyboard.nextInt();
		sh.area(a,b,c);
		break;
		
	case "square":
		Shape sh2= new Shape();
		System.out.println("Enter value of side");
		int s=keyboard.nextInt();
		sh2.area(s);
		break;
		
	case "rectangle":
		Shape sh3= new Shape();
		System.out.println("Enter values of length, breadth");
		int len=keyboard.nextInt();
		int br=keyboard.nextInt();
		sh3.area(len,br);
		break;
	
	default:System.out.println("Invalid input");
		break;
		}
	
	keyboard.close();
		
	}

}
