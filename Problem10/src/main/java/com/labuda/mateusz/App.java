package com.labuda.mateusz;

/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class App {
	
public static void main(String[] args) {
	int a=1;	
	outer:
	while(a<1000){
		a++;
		for(int b=1;b<999;b++){
		int squareC = square(a)+square(b);
		double c= Math.sqrt(squareC);
		if(c%1==0 && a+b+c==1000){
		int product =(int) (a*b*c);
		System.out.println(product);
		System.out.println("got it "+ a +" "+b+" "+c );
		break outer;
		}
		}
	}
	
}

	public static int square(int number){
		return (int) Math.pow(number,2);
	}
}
