package com.github.brunoroberto.sorting.time;

public class ExecutionTimePrinter {

	public static void print(ExecutionTime executionTime) {
		System.out.println(String.format("Execution time: %d millis", executionTime.getExecutionTimeMillis()));
	}

}
