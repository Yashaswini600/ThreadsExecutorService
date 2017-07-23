package com.threads;

import java.util.concurrent.TimeUnit;

public class TargetThread implements Runnable {

	private static int count = 0;
	private int id;
	
	@Override
	public void run() {
		System.out.println("Thread" + id + "> started");

		
		for (int i=10; i>0; i--) {
			System.out.println("Thread" + id +  + i);
			try{
				TimeUnit.MILLISECONDS.sleep((long)(Math.random() * 1000));	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread" + id + "> Ended");

	}
	public TargetThread() {
		this.id = ++count;
	}
}