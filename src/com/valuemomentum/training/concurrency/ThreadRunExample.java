package com.valuemomentum.training.concurrency;

public class ThreadRunExample {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new HeavyWoekRunnable(),"t1");
		Thread t2=new Thread(new HeavyWoekRunnable(),"t2");
		System.out.println("starting runnable threads");
		t1.start();
		t2.start();
		System.out.println("runnable threads has been started");
		Thread t3=new MyThread2("t3");
		Thread t4=new MyThread2("t4");
		System.out.println("starting MyThread");
		t3.start();
		t4.start();
		System.out.println("MyThreds has been started");
		
	}

}
