package com.github.brunoroberto.sorting;

import com.github.brunoroberto.sorting.time.ExecutionTime;

/**
 * Sorting problem:
 * 
 * We want to sort an array of size N, from smaller to the biggest
 * 
 * Input: [a, b, c,..., N] Output: [a', b', c',...,N]
 * 
 * Where a' <= b', b' <= c',..., array[N-1] <= array[N]
 * 
 * @author brunoroberto
 *
 * @param <T>
 */
public abstract class Sort<T extends Comparable<T>> {

	protected ExecutionTime executionTime = new ExecutionTime();

	public ExecutionTime getExecutionTime() {
		return this.executionTime;
	}

	public abstract void sort(T[] values);

	protected boolean isGreaterThan(T o1, T o2) {
		return o1.compareTo(o2) > 0;
	}

}
