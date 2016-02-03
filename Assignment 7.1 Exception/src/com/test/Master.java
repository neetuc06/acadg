package com.test;
import java.util.Scanner;

public class Master {

	public static void main(String[] args) {
		
		int[] arr ={40,50,23,78,95};
		int index =getInput();
				
		try {System.out.println(getEle(index,arr));
		} catch (Exception e) {
			System.out.println("Array out of bound exception");
		}
		
	}
	
	public static int getInput(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter index of element to be entered");
		int n = keyboard.nextInt();
		keyboard.close();
		return n;
	}
	
	public static int getEle(int index, int[] arr){
		int ele =arr[index];
		return ele;
	}

}
