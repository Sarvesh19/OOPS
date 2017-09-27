package com.snippet;

public class Fibonacci {
	// The simplest is the series 1, 1, 2, 3, 5, 8,13....
	static void getFibonaccciNum(int array) {
		int f1, f2, f3 = 0;
		f1 = 0;
		f2 = 1;
		for (int i = 0; i < array; i++) {
			f3 = f1 + f2;
			System.out.print(" " + f3 + " ");
			f1 = f2;
			f2 = f3;
		}

	}

	public static void main(String[] args) {
		Fibonacci.getFibonaccciNum(15);
	}
}
