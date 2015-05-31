package com.labuda.mateusz;

import java.math.BigInteger;

/*Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
 How many such routes are there through a 20×20 grid?
 */

public class App {
	static final BigInteger GRID_SIZE = new BigInteger("20");

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		BigInteger numberOfRoutes = factorial(
				GRID_SIZE.multiply(BigInteger.valueOf(2L))).divide(
				(factorial(GRID_SIZE).multiply(factorial(GRID_SIZE))));
		System.out.println(numberOfRoutes);
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime + " ms");
	}

	static BigInteger factorial(BigInteger number) {
		BigInteger result = BigInteger.valueOf(1L);
		for (int i = 1; i <= Integer.valueOf(number.toString()); i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
}