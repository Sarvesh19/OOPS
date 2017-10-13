class SuperDummy {
	 void m1() {
		System.out.println("m1 method");
	}
}

public class Dummy extends SuperDummy {
	void m1() {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {

		System.out.println("lol");
		main(1);
	}

	public static void main(int i) {
		System.out.println(i);
	}
}
