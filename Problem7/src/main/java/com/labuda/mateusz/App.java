package com.labuda.mateusz;

/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?*/
public class App {


	public static void main(String[] args) {
		int position=1;
		long number = 0;
		while(position<10001){
			number++;
			
			if(isPrime(number)){
				position++;
				System.out.println("position "+position+" prime number is "+number);
			}
				
		}
	}
	
	public static boolean isPrime(long number){
		for(long i=2; i<number;i++){
			if(number%i==0)
				return false;		}
		return true;
	}
}
