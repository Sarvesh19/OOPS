package com.snippet;

public class ReverseString {
	static String reverseString(String str) {
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		return revStr;

	}

	public static void main(String[] args) {
		System.out.println(reverseString("Sarvesh"));
	}
}
