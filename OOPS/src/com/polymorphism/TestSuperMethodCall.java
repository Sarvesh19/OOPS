package com.polymorphism;

class Parent {
	public Parent() {
		System.out.println("parent constructor");
	}

	public void show() {
		System.out.println("Parent show");
	}
}

class Child extends Parent {
	public Child() {
		super();
		super.show();
	}

	public void show() {
		super.show();
		System.out.println("child show");
	}
}

public class TestSuperMethodCall {
	public static void main(String[] args) {
		new Child();
	}
}
