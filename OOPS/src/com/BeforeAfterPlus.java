package com.array;

import java.math.BigDecimal;

public class BeforeAfterPlus {
	public static void main(String[] args) {
		int a = 999999999;
		int b = 999999999;
		b = b + a;
		b += a; // error : cannot convert from int to byte b += a; // ok
		System.out.println(b);
		System.out.println(3 * 0.1);
		System.out.println(3 * 0.1 == 0.3 ? true : false);
		String sr = "sarvesh";
		System.out.println(System.nanoTime());
		System.out.println(sr.hashCode());
		System.out.println(System.nanoTime());
		System.out.println(sr.hashCode());
		System.out.println(System.nanoTime());
		
		System.out.println(new BigDecimal(12.1) == new BigDecimal(12.1));
		System.out.println(Integer.parseInt("15"));
		System.out.println(Runtime.getRuntime().totalMemory());
		
		
		// 2274503737418
		// --- 170857
		// 2274503908275
		// ---- 100824
		// 2274504009099
		//
		//
		// 2306380929956
		// ---- 433481
		// 2306381363437
		// ----- 153953
		// 2306381517390
		//
		// 2323933615156
		// ----- 138255
		// 2323933753411
		// ----- 83316
		// 2323933836727
	}
}
