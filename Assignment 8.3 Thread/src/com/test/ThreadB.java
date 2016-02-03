package com.test;

public class ThreadB implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 75; i++) {
			System.out.println("Thread B is running loop number " + i);
		}
		
	}

}
