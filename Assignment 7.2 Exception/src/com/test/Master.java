package com.test;
import java.util.Scanner;


public class Master {
	
	public static void main(String[] args) {
		String s = getInput();
		
		int num=0;
		try {num = Integer.parseInt(s);
			} catch (Exception e) {
			System.out.println("Please enter integer value");
		}
		System.out.println(num); // How to stop printing 0 value if exception
	}
	
	public static String getInput(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter integer");
		String s = keyboard.next();
		keyboard.close();
		return s;		
	}

}
