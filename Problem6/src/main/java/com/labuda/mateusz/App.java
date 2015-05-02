package com.labuda.mateusz;

public class App {

	public static void main(String[] args) {
		int[] array = new int[100];
		int sum = 1;
		
		for(int n=0; n<100;n++){
			array[n]=sum;
			sum++;
		}
		
		
		int sum1 = 0;
		
		for(int a=0; a<array.length;a++){
			sum1+=array[a];
		}
		
		int sum2 = 0;
		
		for(int a=0; a<array.length;a++){
			sum2+=Math.pow(array[a],2);
		}
		
		int result = (int) (sum2 - Math.pow(sum1,2));
		System.out.println(-result);
	}
	

}
