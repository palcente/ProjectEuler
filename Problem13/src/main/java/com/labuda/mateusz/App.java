package com.labuda.mateusz;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
*/
public class App {
	public static void main(String[] args) {
		InputStream is = App.class.getResourceAsStream("/number");
		Scanner s = new Scanner(is);

	}
	
	static void decompose(Scanner s){
		ArrayList<Integer> array = new ArrayList<Integer>();
		while(s.hasNext()){
			s.nextLine().toCharArray();
		}
	}
}
