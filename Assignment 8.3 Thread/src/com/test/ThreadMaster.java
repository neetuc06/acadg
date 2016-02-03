package com.test;

public class ThreadMaster {
	
public static void main(String[] args) {
	
	ThreadA a = new ThreadA();
	a.setPriority(1);
	a.start();
	
	Runnable runnableb = new ThreadB();
	Thread b = new Thread(runnableb);
	b.setPriority(5);
	b.start();
	
	Runnable runnablec = new ThreadC();
	Thread c = new Thread(runnablec);
	c.setPriority(10);
	c.start();
}

}
