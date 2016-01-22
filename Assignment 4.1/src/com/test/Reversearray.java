package com.test;

public class Reversearray {
	
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		arr[0]=20;
		arr[1]=30;
		arr[2]=40;
		
		int[] temp = new int[3];
		for (int i=0;i<arr.length; i++ ){
			temp[i]= arr[arr.length-1-i];
			System.out.println(temp[i]);
		}
			
	}

}
