package com.polymorphism;

class Alpha {
	static {
		System.out.println("Hello static block 1..");
	}
	Alpha doStuff() {
		return new Alpha();
	}

	static {
		System.out.println("Hello static block 1");
	}
}

class Beta extends Alpha {
	Beta doStuff() {
		return new Beta();
	}

	static {
		System.out.println("Hello static block 2");
	}
}

public class TestOverrideReturnType {
	public static void main(String[] args) {
		Alpha a = new Alpha();
		Alpha a1 = new Beta();
		System.out.println(a.doStuff());
		System.out.println(a1.doStuff());
	}

	static {
		System.out.println("Hello static block 3");
	}
}
