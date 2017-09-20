package com.widening;

public class TestBoxing {
	
	public static void main(String[] args) {
		int i = 10;
		Integer iObject = new Integer(i);
		System.out.println(iObject);
		int b = iObject.intValue();
		System.out.println(b);
		String str = "sarvesh";
		System.out.println(String.valueOf(str));
	}
}
