package com.test;

public class ThreadA extends Thread{
	
	public void run(){
	for (int i = 0; i < 100; i++) {
		System.out.println("Thread A is running loop number " + i);
	}

}
	
}
