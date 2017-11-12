package com.infy;

public class TestStarPattern {
	static int count0 = 0;
	static int count1 = 0;
	static int count2 = 0;
	static int count3 = 4;
	static int jVal = 4;

	static void createStarPatternLeftDown() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i >= count0) {
					System.out.print("0 ");
					count0++;
				}

			}
			count0 = 0;
			System.out.println();
		}

	}

	static void createStarPatternLefttop() {
		for (int i = 0; i < 4; i++) {
			for (int j = count1; j < 4; j++) {
				System.out.print("0 ");

			}
			count1++;
			System.out.println(" ");

		}
	}

	static void createStarPatternRightTop() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (count2 > j) {
					System.out.print(" ");
				} else {
					System.out.print("0");
				}
				System.out.print(" ");
			}
			count2++;
			System.out.println(" ");
		}
	}
	static int tempjVal = jVal ;
	static void createStarPatternRightDown() {
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < jVal; j++) {
				if (j < tempjVal-1) {
					System.out.print(" ");
				} else {
					System.out.print("0");
				}
				System.out.print(" ");
			}
			tempjVal--;
			count3--;
			System.out.println(" ");
		}
	}

	static {

		createStarPatternLeftDown();
		createStarPatternLefttop();
		createStarPatternRightTop();
		createStarPatternRightDown();

	}

	public static void main(String[] args) {

	}

}
