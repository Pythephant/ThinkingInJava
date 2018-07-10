package interfaces;

class A {
	public int i = 1;
}

public class testCastAddr {
	public static void process(Object o) {
		System.out.println("process(Object), " + o);
		process((A) o);
	}

	public static void process(A a) {
		System.out.println("process(A), " + a);
		a.i = 0;
	}

	public static void main(String[] args) {
		Object o = new A();
		process(o);
		System.out.println(((A) o).i);
	}

	/**
	 * the cast will not change the address of the object guess that casting just
	 * play with the declaration of the object, as broaden or narrow the view sight
	 * of the storage of the object
	 */
}
