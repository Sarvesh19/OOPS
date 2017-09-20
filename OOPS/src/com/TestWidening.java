package com.widening;

import java.util.Arrays;
import java.util.List;

public class TestWidening {
	static void go(int... i) {
		System.out.println("int go " + i[0]);
	}

	static void go(long l) {
		System.out.println("long go " + l);
	}

	static void go(double d) {
		System.out.println("double go " + d);
	}

	public static void main(String[] args) {
		byte b = 5;
		short a = 5;
		long l = 5;
		float f = 15.2f;
		Integer [] i = {14,74,47,8};
		
		
//		List<int []> listo = Arrays.asList(i);
//		for (int[] js : listo) {
//			System.out.print(js[0]);
//		}
		go(b);
		go(a);
		go(l);
		go(f);
		for (int j = 0; j < i.length; j++) {
			go(i[j].intValue());
		}
		

	}
}
