package com.labuda.mateusz;

/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

 a2 + b2 = c2
 For example, 32 + 42 = 9 + 16 = 25 = 52.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.
 */

public class App {
		
	public static void main(String[] args) {
		outer:
		for(int a=1;;a++){
			inner:
				for(int b=2;;b++){
				int csq = a*a+b*b;
				if(a+b+Math.sqrt(csq)>1000){
					break inner;
				}
				if(a+b+Math.sqrt(csq)==1000){
					int product = (int) (a*b*Math.sqrt(csq));
					System.out.println(product);
					break outer;
				}
				}
		}
	}

}
