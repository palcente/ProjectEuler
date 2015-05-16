package com.labuda.mateusz;

import java.util.concurrent.RecursiveTask;

public class WorkerThread extends RecursiveTask<Long> {

	long startLoop;
	long endLoop;
	
	public WorkerThread(long startLoop, long endLoop){
			this.startLoop = startLoop;
			this.endLoop = endLoop;
	}
	@Override
	protected Long compute() {
		if(endLoop-startLoop<=100_000){
			long sum=0;
			for(long n=startLoop; n<endLoop;n+=1){
				if(isPrime(n)){
					sum+=n;
				}
			}
			System.out.println("added "+sum);
			return sum;
		}
		else{
			long mid = startLoop + (endLoop-startLoop)/2;
			WorkerThread leftPortionOfLoop = new WorkerThread(startLoop, mid);
			WorkerThread rightPortionOfLoop = new WorkerThread(mid, endLoop);
			leftPortionOfLoop.fork();
			long rightAnswer = rightPortionOfLoop.compute();
			long leftAnswer = leftPortionOfLoop.join();
			long sum = leftAnswer+rightAnswer;
			System.out.println("added "+sum);
			return sum;
		}
		
	}
	
	public static boolean isPrime(long n) {
		for(long i=2;i<n;i++){
			if(n%i==0 && i!=n){
			return false;
			}
	}
	return true;
	}

}
