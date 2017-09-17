package com.polymorphism;

class SleveSuper extends Object {
	SleveSuper() {
		System.out.println("SlaveSup()");
	}
	SleveSuper(int k) {
		System.out.println("SlaveSup() "+k);
	}
}

class SlaveSub1 extends SleveSuper {
	SlaveSub1() {
		System.out.println("SlaveSub1()");
	}
	SlaveSub1(int j) {
		super(j);
		System.out.println("SlaveSub1() "+j);
	}
}

class SlaveSub2 extends SlaveSub1 {
	SlaveSub2() {
		System.out.println("SlaveSub2()");
	}
	SlaveSub2(int i) {
		super(i);
		System.out.println("SlaveSub2() "+i);
	}
}

public class TestConstructor {
	public static void main(String[] args) {
		new SlaveSub2();
		new SlaveSub2(2);
	}

}
