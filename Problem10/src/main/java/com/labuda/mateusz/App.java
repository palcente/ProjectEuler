package com.labuda.mateusz;

import java.util.concurrent.ForkJoinPool;

public class App {
	
	  public static ForkJoinPool fjPool = new ForkJoinPool();

	public static void main(String[] args) {
		System.out.println(fjPool.invoke(new WorkerThread(2,2_000_001)).toString());

	}
}
