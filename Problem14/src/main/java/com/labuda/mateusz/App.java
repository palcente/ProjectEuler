package com.labuda.mateusz;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Map<Long, Long> map = new HashMap<Long, Long>();
		for (long number = 1_000_000L; number > 0; number--) {
			long sum = 0;
			long current = number;
			while (current != 1) {
				current = next(current);
				sum++;
			}
			map.put(number, sum);
			sum = 0;
		}

		System.out
				.println(map
						.entrySet()
						.stream()
						.max((entry1, entry2) -> entry1.getValue() > entry2
								.getValue() ? 1 : -1).get().getKey());
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime);

	}

	private static long next(long number) {

		if (number % 2 == 0) {
			return number / 2;
		} else {
			return (3 * number) + 1;
		}
	}
}
