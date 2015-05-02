package com.labuda.mateusz;

/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class App {
	static int target = 999;

/*	public static void main(String[] args) {
		int sum=0;
		for(int n = 1; n<1000; n++){
			if(n%3==0 || n%5==0){
				sum+=n;
			}
		}
		System.out.println(sum);
	}*/
	
	public static void main(String[] args) {
		System.out.println(sumDivisibleBy(3)+sumDivisibleBy(5)-sumDivisibleBy(15));
	}
	
	public static int sumDivisibleBy(int number){
		int p = target/number;
		return number*(p*(p+1))/2;
	}

}
