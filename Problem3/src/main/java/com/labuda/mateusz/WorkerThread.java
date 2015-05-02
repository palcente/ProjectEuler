package com.labuda.mateusz;

public class WorkerThread implements Runnable {
	
	private long factor;
	
	
	public WorkerThread(long factor) {
		super();
		this.factor = factor;
		run();
	}

	public void run() {
		
		loop:
		while(true){
		for(long k=2;k<=factor;k++){
			if(factor%k==0 && k!=factor){
			break loop;
			}
			}
		System.out.println("Found one:" + factor);
		break loop;
		}
	}
	
	
}
