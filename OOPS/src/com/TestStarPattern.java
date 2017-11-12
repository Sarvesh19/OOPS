package com.infy;

public class TestStarPattern {
	static int count = 0;
	static void createStarPattern() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(i >= count){
					System.out.print("0 ");
					count++;
				}
				
			}
			count = 0;
			System.out.println();
		}
		
	}

	static {

		createStarPattern();

	}
	public static void main(String[] args) {
		
	}

}
