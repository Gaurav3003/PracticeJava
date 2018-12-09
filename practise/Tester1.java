package com.practise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tester1 {

	public static void main(String[] args) {
		//1. Fixed threadpool
		//2. Cached thread pool
		//3. scheduled thread pool
		//4. single threaded executor
		//ExecutorService service = Executors.newFixedThreadPool(10);
		ExecutorService service = Executors.newCachedThreadPool();
		for (int i =0;i<100;i++) {
			service.execute(new Task());
		}
		System.out.println("Thread name: "+ Thread.currentThread().getName());

	}
	
	static class Task implements Runnable{

		@Override
		public void run() {
			System.out.println("Thread name:"+ Thread.currentThread().getName());
			
		}
		
	}

}


