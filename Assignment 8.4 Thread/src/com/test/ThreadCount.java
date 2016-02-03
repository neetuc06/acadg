package com.test;

public class ThreadCount extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
		System.out.println("Printing the count "+ i);
		}
		
		System.out.println("My thread run is over");
	}

}
