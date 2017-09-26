package com.encapsulationvsabstraction;

public class TestAbstraction {
	public TestAbstraction() {
		System.out.println("TestAbstraction constructor");
	}

	static void m1() {
		new TestAbstraction();
	}

	public static void main(String[] args) {
		m1();
	}
}
