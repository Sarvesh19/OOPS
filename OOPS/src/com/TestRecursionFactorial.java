package com.snippet;

interface demo {
	void retrevie(int i);
}

public class TestRecursionFactorial {

	private static int getFactorial(int a) {
		if (a == 1) {
			return 1;
		}

		return a * getFactorial(a - 1);
	}

	public static void main(String[] args) {
		System.out.println(getFactorial(5));
	}
}
