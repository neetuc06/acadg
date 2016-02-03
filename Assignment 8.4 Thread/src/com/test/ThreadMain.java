package com.test;

public class ThreadMain extends Thread {
	
	@Override
	public void run() {
		System.out.println("my thread createdThread[my extending thread,5,main]" );
		
		ThreadCount c = new ThreadCount();
		c.setPriority(MAX_PRIORITY);
		c.start();
		
		while (c.isAlive()) {
			System.out.println("Main thread will be alive till the child thread is live");}
		
		
		if (!c.isAlive()){System.out.println("Main thread's run is over");}
	
			}

}