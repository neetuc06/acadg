package com.test;
import java.util.Scanner;

public class Sqrt {
	
	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Please enter number:");
		double n= keyboard.nextDouble();
		System.out.println("Square root of number is:"+ Math.sqrt(n));
		System.out.println("Cube root of number is:"+ Math.cbrt(n));
		keyboard.close();
	}

}
