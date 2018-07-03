package reusing.classes;

public class E05_InheritAndComposition {
	public static void main(String[] args) {
		new C();
	}
}

class A {
	public A() {
		System.out.println("Construct A");
	}
}

class B {
	public B() {
		System.out.println("Construct B");
	}
}

class C extends A {
	private B b = new B();
	// without C constructor, base class A will be object first ,then the member
	// B

	// try the constructor C again
	// base class first;
	public C() {

	}

}
