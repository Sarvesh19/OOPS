package com.polymorphism;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

class Sup {
	void supMethod1() throws Exception {
		System.out.println("sup methdo");
		throw new IOException("hello");
	}
	Sup(){
		System.out.println("Hello super const");
	}
	Sup(int i){
		System.out.println("para const "+i);
	}
}

class Sub extends Sup {
	void supMethod1() throws Exception {
		super.supMethod1();
		System.out.println("sub's supmethdo methdo");
	}

	void otherNonOverridenMethod() {
		System.out.println("invoke non overridden");
	}
	Sub(){
		//super();  only one super const caall allowed
		super(5);
	}
}

public class SuperSubClass {
	static Sup supObject = new Sup();

	public static void main(String[] args) {
		// throws is a keyword in Java which is used in the signature of
		// method to indicate that this method might throw one of the listed
		// type exceptions.
		// The caller to these methods has to handle the exception using a
		// try-catch block.

		Sup subObject = new Sub();
		try {
			subObject.supMethod1();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// supObject.otherNonOverridenMethod();
		// complier can only invoke reference type's method

		try {
			supObject.supMethod1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("i survived");
	}
}
