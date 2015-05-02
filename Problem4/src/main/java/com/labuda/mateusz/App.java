package com.labuda.mateusz;

import java.util.ArrayList;
import java.util.Collections;

/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class App {

	public static void main(String[] args) {
		Long a = 999L;
		Long b = 999L;
		ArrayList<Long> bigPolindromes = new ArrayList<Long>();
		outer: while (a > 0) {
			while (b > 0) {
				Long result = a * b;
				b--;
				char[] array = Long.toString(result).toCharArray();
				if (checkPalindrome(array)) {
					bigPolindromes.add(result);
				}
			}
			a--;
			b=999L;
		}
		Collections.sort(bigPolindromes);
		bigPolindromes.forEach(polindrome->System.out.println(polindrome));
	}
	

	private static boolean checkPalindrome(char[] array) {
			for(int n=0;n<(array.length)/2;n++){
				if(array[n]!=array[array.length-1-n]){
					return false;
				}
			}
		return true;
	}
}
