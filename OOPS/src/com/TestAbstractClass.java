package com.HashMapTest;

abstract class AbstractClass {
	AbstractClass() {
		this(10);
	}

	private AbstractClass(int i) {
		System.out.println("private parameterized constr : " + i);
	}
}

public class TestAbstractClass extends AbstractClass{
	// whether we call it or not but sub's constructor will call parent's constructor
	TestAbstractClass(){
		// super();
		System.out.println("hell ooo");
	}
	
	public static void main(String[] args) {
		AbstractClass abs = new TestAbstractClass();
	}
}
