package com.labuda.mateusz;

public class App {

	public static void main(String[] args) {
		int[] numbers = new int[1000];

	    numbers[0] = 1;
	    for (int i = 0; i < 1000; i++)
	    {
	        for (int j = numbers.length - 2; j >= 0; j--)
	        {
	            numbers[j] *= 2;
	            numbers[j + 1] += numbers[j] / 10;
	            numbers[j] %= 10;
	        }
	    }

	    long sum = 0;
	    for (int i = 0; i < numbers.length; i++)
	    {
	        sum += numbers[i];
	    }
	    
	    System.out.println(sum);

	}
}
