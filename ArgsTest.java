package com.encapsulation;

public class ArgsTest {
	public static void main(String[] args) {
		Integer i = Integer.parseInt(args[args.length - 1]);
		int k = i.intValue();
		
		if(args.length>1){
			System.out.println("greater than one" + k);
		} else if(args.length >0){
			System.out.println("greater than zero"+ k);
		} else {
			System.out.println("bye");
		}
	}
}
