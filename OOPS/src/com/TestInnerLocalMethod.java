package com.innerouterclass;

public class TestInnerLocalMethod {
	static void m() {
		System.out.println("Outer m method");

		class MMethodInner {
			MMethodInner() {
				System.out.println("MMethodInner constructor");

			}

			void m() {
				System.out.println("m of MMethodInner");
			}
		}
		MMethodInner inner = new MMethodInner();
		inner.m();

	}

	public static void main(String[] args) {
		m();
	}
}
