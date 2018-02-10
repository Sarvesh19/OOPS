package com.core.java;

import java.util.Arrays;

class Animal {
	void eat(int... i) {
		System.out.println((i.length > 1) ? getArrayData(i)[0] : i[0]);
	}

	private int[] getArrayData(int... i) {
		int[] listArray = new int[i.length];
		int [] newCopiedArray = {};
		int [] destArray = new int[i.length];
		for (int j = 0; j < i.length; j++) {
			listArray[j] = i[j];
			System.out.print(listArray[j] + " ");
		}
		newCopiedArray = Arrays.copyOf(listArray, i.length) ;
		System.arraycopy(newCopiedArray, 0, destArray, 0, i.length - 1);
		System.out.println(destArray);
		System.out.println(newCopiedArray);
		return listArray;
	}
}

class Cat extends Animal {
	void eat(int... i) {
		System.out.println("hello eat ofssssssssssssssss animal");
	}
}

public class TestInheritance {
	public static void main(String[] args) {
		Animal a = new Cat();
		Animal a1 = new Animal();
		a.eat(25);
		a1.eat(14, 45, 4, 4);
		a1.eat(254);
	}
}
