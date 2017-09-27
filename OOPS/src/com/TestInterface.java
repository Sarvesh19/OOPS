package com.snippet;

interface IAnimal {
	int i = 10;
	void eat();
}

abstract class  Animal implements IAnimal {
	Animal() {
		System.out.println("Hi Animal constructor() " + i);
	}
	void m1(){
		System.out.println("Animal non overriden method ");
	}
	abstract void running();
}

class Dog extends Animal {
	Dog() {
		System.out.println("Hi Dog constructor() " + i);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void running() {
		// TODO Auto-generated method stub
		
	}
}

class MaleDog extends Dog {
	MaleDog() {
		System.out.println("Hi MaleDog constructor() " + i);
	}
	void m1(){
		super.m1();
		System.out.println("male dog non overriden method ");
	}
}

public class TestInterface {
	public static void main(String[] args) {
		// System.out.println(i);
		IAnimal animalAmleDog = new MaleDog();
		System.out.println("-----------");
		IAnimal animalDog = new Dog();
		System.out.println("-------m1----");
		MaleDog ma = new MaleDog();
		ma.m1();
	}
}
