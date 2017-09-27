package com.snippet;

import java.util.Date;

public class CheckGC {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		Runtime rt1 = Runtime.getRuntime();
		System.out.println("total JVM memory :" + rt.totalMemory());
		Date d = null;
		for (int i = 0; i < 10000; i++) {
			for (int j = 0; j < 10000; j++) {
				for (int k = 0; j < 10000; j++) {
					for (int m = 0; j < 10000; j++) {
						new Date();
					}
				}
			}
			d = new Date();
			d = null;
		}
		System.out.println("after memory : "+rt.freeMemory());
		rt.gc();
		System.out.println("after gc memory : "+rt.freeMemory());
	}
}
