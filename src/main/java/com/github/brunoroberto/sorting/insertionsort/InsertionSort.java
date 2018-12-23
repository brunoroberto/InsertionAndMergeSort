package com.github.brunoroberto.sorting.insertionsort;

import com.github.brunoroberto.sorting.Sort;

/**
 * Insertion sort is an algorithm of sorting that works the way we sort playing
 * cards in our hands.
 * 
 * We compare the 'key' with the others values wich are already sorted and then
 * put it in the right spot
 * 
 * @author brunoroberto
 *
 * @param <T>
 */
public class InsertionSort<T extends Comparable<T>> extends Sort<T> {

	@Override
	public void sort(T[] values) {
		try {
			this.executionTime.start();
			if (values == null || values.length <= 0) {
				return;
			}
			for (int i = 1; i < values.length; i++) {
				T key = values[i];
				int j = i - 1;
				while (j >= 0 && isGreaterThan(values[j], key)) {
					values[j + 1] = values[j];
					j--;
				}
				values[j + 1] = key;
			}
		} finally {
			this.executionTime.stop();
		}
	}

}
