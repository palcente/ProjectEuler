package com.labuda.mateusz;

/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class App {

	public static void main(String[] args) {
	int number=20;
	outer:
	while(true){
		number++;
		
		if(isEvenlyDivisible(number)){
			System.out.println("got it " + number);
			break outer;
		}
	}
		
	}
	
	public static boolean isEvenlyDivisible(int number){
		for(int k=2;k<=20;k++){
			if(number%k!=0){
			return false;
			}
						}
		return true;
	}
		}
	