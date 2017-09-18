package com.innerouterclass;

final class DontExtendMe {
	void DontExtendMeMethod() {
		System.out.println("DontExtendMeMethod");
	}

	class InnerClass {

		public void InnerClassMethod() {
			System.out.println("InnerClassMethod");
		}
		
		

	}
	public InnerClass getInnerClass(){
		return new InnerClass();
		
	}

	 static class StaticClass {

		void StaticClassMethod() {
			System.out.println("StaticClassMethod");
		}

	}

}

public class TestInnerClass {
	public static void main(String[] args) {
		DontExtendMe d = new DontExtendMe();
		d.DontExtendMeMethod();
		d.getInnerClass().InnerClassMethod();
		DontExtendMe.StaticClass n = new DontExtendMe.StaticClass();
		n.StaticClassMethod();
	}
}
