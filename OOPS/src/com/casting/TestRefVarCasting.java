package com.casting;

class Animal {
	void m1() {
		System.out.println("m1 of animal");
	}
}

class Dog extends Animal {
	void m1() {
		System.out.println("m1 of Dog");
	}

	void m2() {
		System.out.println("m2 of Dog");
	}
}

public class TestRefVarCasting {
	public static void main(String[] args) {
		Animal a[] = { new Animal(), new Dog(), new Animal() };
		for (Animal one : a) {
			one.m1();
			if (one instanceof Dog) {
				((Dog) one).m2();
			}
			Animal ani = new Animal();
			// Dog d = (Dog) ani; illegal
			// d.m1();
			// d.m2();
		}
	}
}
