package com.test;
import java.util.Scanner;

public class Master {
	
	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a number");
	int x= keyboard.nextInt();
	
	ClassA objA= new ClassA();
	int y= objA.method(x);
	System.out.println("Result with first implementation is "+ y);
	
	ClassB objB= new ClassB();
	int z= objB.method(x);
	System.out.println("Result with second implementation is "+ z);
	
	keyboard.close();
	
	
	}

}
