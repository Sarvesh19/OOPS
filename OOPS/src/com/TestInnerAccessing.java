package com.innerouterclass;

class Outer {

	private class Inner {
		// static void innerClassMthod(){
		// staic should be in static class but static class can have non static
		// method
		// }
		private int i = 10;
		
		void m1(){
			System.out.println("Inner m1()");
		}

	}
	
	
	 class DefaultInner {
		// static void innerClassMthod(){
		// staic should be in static class but static class can have non static
		// method
		// }
		private int i = 10;
		
		void m1(){
			System.out.println("Inner m1()");
		}

	}
	
	
	void m1(){
		Inner i = new Inner();
		System.out.println("Outer m1() "+i.i);
	}

}

public class TestInnerAccessing {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.DefaultInner defaultInner = new Outer().new DefaultInner();
		defaultInner.m1();
		outer.m1();
	}
}
