package com.snippet;

public class Palindrome {
	static boolean iSPalindrome(String str) {
		int count = 0;
		boolean flag = false;
		int lastIndex = str.length() - 1;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) == str.charAt(lastIndex)) {
				lastIndex--;
				count++;
			}
		}
		if (count == str.length() / 2) {
			flag = true;
		}
		return flag;

	}

	public static void main(String[] args) {
		boolean isPalindrome = false;
		isPalindrome = iSPalindrome("pitbull");
		if (isPalindrome) {
			System.out.println("yes it is palindrome");
		} else {
			System.out.println("No its not palindrome");
		}
	}
}
