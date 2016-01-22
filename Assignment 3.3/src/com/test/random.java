package com.test;
import java.util.Scanner;

public class random {
	
public static void main(String[] args) {
	
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Please enter number:");
	int input = keyboard.nextInt();
	int output= (int) (Math.random()*input);
	System.out.println("Random number between 0 and "+ input+" is: "+ output);
	keyboard.close();
}
}
