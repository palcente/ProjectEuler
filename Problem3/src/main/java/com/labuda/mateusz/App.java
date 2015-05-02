package com.labuda.mateusz;

/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/
public class App {

	public static void main(String[] args) {
		
		final long theNumber = 600851475143L;
		for(long factor=1;factor<theNumber;factor++){
			if(theNumber%factor==0){
				new WorkerThread(factor);
				
				}
			}
		}
	}

	