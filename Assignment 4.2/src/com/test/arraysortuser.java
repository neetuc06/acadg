package com.test;
import java.util.Scanner;

public class arraysortuser {

	public static void main(String[] args) {
		
		// Get array through user input
		
		Scanner keyboard = new Scanner(System.in);
				
		System.out.println("Enter length of array");
		int len= keyboard.nextInt();
		int[] arr = new int[len];
		
		System.out.println("Enter elements of array");
		for(int i=0; i< len ;i++) {
			arr[i]=keyboard.nextInt();}
	
		
		//Sort elements of array and print new array
				
		for (int i=0; i<arr.length;i++){
		for (int j=i+1; j<arr.length;j++){
			if (arr[i]<arr[j]) continue;
			else 
				{int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				}
			;}
		;}
		
		System.out.println("Sorted array is");	
		for (int k=0; k<arr.length;k++) {System.out.println(arr[k]);}
		
		//Enter new element and add it in sorted array
		
		System.out.println("Enter new element to be added in array");
		int n = keyboard.nextInt();
		
		int[] arr2= new int[len+1];
			for (int i = 0; i < arr2.length; i++) {
			if (arr[i]<n) {arr2[i]=arr[i];
			} else { 
				arr2[i]=n;
				for(int j=i; j<arr.length;j++){arr2[j+1]=arr[j];}
				break;
			}
		;}
			
		System.out.println("New array with element included is:");
		for (int k=0; k<arr2.length;k++) {System.out.println(arr2[k]);}
		
		keyboard.close();
	}

}
