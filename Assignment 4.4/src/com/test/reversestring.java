package com.test;
import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter String");
	String str= keyboard.next();
	
	int len = str.length();
	String str2 = "";
	
	 
	 for(int i=len-1; i>=0; i--) 
	 {str2 = str2 + str.charAt(i) ;} 
	 
	 System.out.println("Reverse of string is:"+ str2);
	 keyboard.close();

	}

}
