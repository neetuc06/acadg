package com.test;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please enter first number:");
	Double n1= keyboard.nextDouble();
	System.out.println("Please enter second number:");
	Double n2= keyboard.nextDouble();
	System.out.println("Please enter operation to be performed (+-*/) ");
	String op= keyboard.next();
	keyboard.close();
	
	System.out.print("Result is: ");
	switch (op) {
	case "+":
		System.out.println(n1+n2);
		break;
		
	case "-":
		System.out.println(n1-n2);
		break;
		
	case "*":
		System.out.println(n1*n2);
		break;
		
	case "/":
		System.out.println(n1/n2);
		break;

	
	}
	
	
	
	}
}
