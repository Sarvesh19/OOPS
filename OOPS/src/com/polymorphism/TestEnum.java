package com.polymorphism;

interface IAnimal {

}

enum Mock {

	TEST(25), TEST2(2), TEST3(5);
	private final int levelCode;

	Mock(int i) {
		this.levelCode = i;
	}

	int getlevelCodeVal() {
		return this.levelCode;
	}

}

public class TestEnum {

	public static void main(String[] args) {
		System.out.println(Mock.TEST3.getlevelCodeVal());
	}
}
