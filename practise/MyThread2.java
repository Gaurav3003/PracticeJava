package com.practise;

public class MyThread2 implements Runnable{

	
	private Object lock1;
	private Object lock2;
	
	

	public MyThread2(Object lock1, Object lock2) {
		super();
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (lock2) {
			System.out.println(Thread.currentThread().getName()+"locked resource 2");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (lock1) {
				System.out.println(Thread.currentThread().getName()+"locked resource 1");
			}
		}
		
	}
	
	



}
