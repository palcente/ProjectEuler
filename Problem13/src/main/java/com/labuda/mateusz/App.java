package com.labuda.mateusz;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 */

public class App {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		InputStream is = App.class.getResourceAsStream("/number");
		Scanner s = new Scanner(is);
		int[][] intArray = decompose(s);
		int[][] transposedArray = transposeArray(intArray);
		int[] summedArray = sumArray(transposedArray);
		ArrayList<Integer> reversedListOfSums = generateReversedListOfSums(summedArray);
		System.out.println(calculateTenFirstDigits(reversedListOfSums));
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime);
	}

	private static String calculateTenFirstDigits(ArrayList<Integer> r) {
		outer: for (int index = 0;; index++) {
			if (r.size() <= index + 1) {
				r.add(0);
			}
			if (r.get(index) > 9) {
				Integer value = r.get(index);
				Integer nextValue = r.get(index + 1);
				int mod = value % 10;
				int rest = (value - mod) / 10;
				r.set(index, value - (rest * 10));
				try {
					r.set(index + 1, nextValue + (rest));
				} catch (ArrayIndexOutOfBoundsException e) {
					r.add(index + 1, nextValue + (rest));
				}
			} else {
				break outer;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = r.size() - 1; i > r.size() - 11; i--) {
			sb.append(r.get(i));
		}
		return sb.toString();
	}

	private static ArrayList<Integer> generateReversedListOfSums(
			int[] summedArray) {
		ArrayList<Integer> reversedListOfSums = new ArrayList<Integer>();
		for (int i = 0; i < summedArray.length; i++) {
			reversedListOfSums.add(Integer.valueOf(summedArray[i]));
		}
		Collections.reverse(reversedListOfSums);
		return reversedListOfSums;
	}

	private static int[] sumArray(int[][] transposedArray) {
		int[] result = new int[50];
		for (int i = 0; i < 50; i++) {
			result[i] = Arrays.stream(transposedArray[i], 0,
					transposedArray[0].length).sum();
		}
		return result;
	}

	static int[][] decompose(Scanner s) {
		int[][] array = new int[100][50];
		for (int i = 0; i < 100; i++) {
			int[] iA = toIntArray(s.nextLine().toCharArray());
			for (int j = 0; j < 50; j++) {
				array[i][j] = iA[j];
			}
		}
		return array;
	}

	static int[] toIntArray(char[] charA) {
		int[] intA = new int[charA.length];
		for (int i = 0; i < charA.length; i++) {
			intA[i] = Character.getNumericValue(charA[i]);
		}
		return intA;
	}

	public static int[][] transposeArray(int[][] array) {

		int newColumns = 50;
		int newRows = 100;

		int[][] transposed = new int[newColumns][newRows];
		for (int m = 0; m < 50; m++) {
			inner: for (int n = 0; n < 150; n++) {
				try {
					transposed[m][n] = array[n][m];
				} catch (ArrayIndexOutOfBoundsException e) {
					break inner;
				}

			}

		}
		return transposed;

	}
}
