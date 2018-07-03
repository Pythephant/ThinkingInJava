package reusing.classes;

public class E07_InheritAndComposition {
	public static void main(String[] args) {
		new C2();
	}
}

class A2 {
	public A2(int i) {
		System.out.println("constructor A2 " + i);
	}
}

class B2 {
	public B2(int i) {
		System.out.println("constructor B2 " + i);
	}
}

class C2 extends A2 {
	// without C constructor, base class A will be object first ,then the member
	// B
	private B2 b = new B2(0);

	// try the constructor C again
	// base class first;
	public C2() {
		super(11);
		System.out.println("constructor C2");
		// b = new B2(1);
	}

	/**
	 * very interesting , in the construction of an object it calls the super()
	 * first, then call initialize the object in the define a then call the
	 * consturct
	 */

}
