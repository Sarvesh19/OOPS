package com.polymorphism;

interface Animals {
 void eating();
}

class Monkey implements Animals {

	public void eating() {
		// TODO Auto-generated method stub
		
	}
	
	public void run(){
		
	}

}

public class InterfacePolymorphicTest {
	public static void main(String[] args) {
		Animals a = new Monkey();
		a.eating();
	}
}
