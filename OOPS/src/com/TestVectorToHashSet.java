package com.encapsulation;

import java.util.HashSet;
import java.util.Vector;
//class Tim {
//	void m1(int i){
//		
//	}
//	int m1(int i){
//		return 0;
//	}
//}

public class TestVectorToHashSet {
	
	public static void main(String[] args) {
		Vector v = new Vector();

		v.add("sarvesh");
		v.add("cevvr");
		v.add("parvesh");
		v.add("Avesh");
		v.add("cevvr");
		v.add("parvesh");
		System.out.println(getval(v));
	}
static Vector getval(Vector v){
	return new Vector(new HashSet(v));
}
}
