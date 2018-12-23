package com.github.brunoroberto.sorting.mergesort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.github.brunoroberto.sorting.Sort;
import com.github.brunoroberto.sorting.time.ExecutionTimePrinter;

public class MergeSortTest {

	private static final int MAX = 100_000;

	@Test
	public void testIntegerSort() {
		System.out.println("MergeSortTest::testIntegerSort");

		Integer[] values = new Integer[MAX];
		Integer[] expectedResult = new Integer[MAX];
		for (int i = MAX, j = 0; i > 0; i--, j++) {
			values[j] = i;
			expectedResult[i - 1] = i;
		}

		Sort<Integer> mergeSort = new MergeSort<>();
		mergeSort.sort(values);

		ExecutionTimePrinter.print(mergeSort.getExecutionTime());

		assertArrayEquals(expectedResult, values);
	}

}
