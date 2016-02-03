package com.test;

import java.util.Scanner;

public class Master {
	
	public static void main(String[] args) {
		
		SampleObj[] arr = new SampleObj[3];
		SampleObj s1 =arr[2];
		System.out.println(s1);
		
	}
	
	public static int getInput(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter index of element to be entered");
		int n = keyboard.nextInt();
		keyboard.close();
		return n;}
			
	

}
