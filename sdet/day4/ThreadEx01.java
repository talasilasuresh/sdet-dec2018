package com.training.sdet.day4;

class MyBusinessLogic extends Thread{
	
//	Simulate some time
	
	public void run(){
		for (int i = 0; i < 500; i++) {
			System.out.println("Value i " + i + ", " + Thread.currentThread().getName());
	  
				
		
		}
	
	System.out.println("Thread " + Thread.currentThread().getName() + " Exising ");
		
	}	
	
	 
}

public class ThreadEx01 {
	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread().getName());

	MyBusinessLogic mbl = new MyBusinessLogic();
	mbl.start();
	
	MyBusinessLogic mbl2 = new MyBusinessLogic();
	mbl2.start();
	
	MyBusinessLogic mbl3 = new MyBusinessLogic();
	mbl3.start();

		try {
			mbl.join();
			mbl2.join();
			mbl3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		 System.out.println("end of main");
	
	}
	
}
