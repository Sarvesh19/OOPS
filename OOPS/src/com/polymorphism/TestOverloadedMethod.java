package com.polymorphism;

class Human {
	void m1() {
		System.out.println("Hello m1 of human class");
	}
}

class Man extends Human {
	void m1() {
		System.out.println("Hello m1 of man class");
	}

	void m1(String s) {
		System.out.println("sub para overloaded method " + s);
	}

	void m1(int i) {

	}

	void m1(int i, byte j) {

	}
	void m1(float i, float j) {

	}
}

public class TestOverloadedMethod {
	Human h = new Human();
	Human h1 = new Man();
	Man m = (Man) h1;
}
