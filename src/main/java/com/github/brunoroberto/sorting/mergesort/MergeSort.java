package com.github.brunoroberto.sorting.mergesort;

import java.util.Arrays;

import com.github.brunoroberto.sorting.Sort;

/**
 * Merge sort is an algorithm of sorting that uses the Divide and Conquer
 * paradigm. It divides input array in two halves, calls itself for the two
 * halves and then merges the two sorted halves
 * 
 * @author brunoroberto
 *
 * @param <T>
 */
public class MergeSort<T extends Comparable<T>> extends Sort<T> {

	@Override
	public void sort(T[] values) {
		try {
			this.executionTime.start();
			if (values == null || values.length <= 0) {
				return;
			}
			mergeSort(values, 0, values.length - 1);
		} finally {
			this.executionTime.stop();
		}
	}

	private void mergeSort(T[] values, int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			return;
		}
		int middleIndex = ((endIndex + startIndex) / 2);
		mergeSort(values, startIndex, middleIndex);
		mergeSort(values, middleIndex + 1, endIndex);
		merge(values, startIndex, middleIndex, endIndex);
	}

	private void merge(T[] values, int startIndex, int middleIndex, int endIndex) {
		T[] left = Arrays.copyOfRange(values, startIndex, middleIndex + 1);
		T[] right = Arrays.copyOfRange(values, middleIndex + 1, endIndex + 1);

		int currentIndex = startIndex;

		int i = 0;
		int j = 0;
		while (i < left.length && j < right.length) {
			if (isGreaterThan(left[i], right[j]))
				values[currentIndex++] = right[j++];
			else
				values[currentIndex++] = left[i++];
		}

		while (i < left.length) {
			values[currentIndex++] = left[i++];
		}

		while (j < right.length) {
			values[currentIndex++] = right[j++];
		}
	}

}
