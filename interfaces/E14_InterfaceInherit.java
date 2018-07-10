package interfaces;

interface A2 {
	void a1();

	void a2();
}

interface B {
	void b1();

	void b2();
}

interface C extends A2, B {
	void c1();

	void c2();
}

class TestC implements C {

	@Override
	public void a1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void a2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void b1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void b2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void c1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void c2() {
		// TODO Auto-generated method stub

	}

}

public class E14_InterfaceInherit {
	public static void testB(B b) {
		b.b1();
	}

	public static void main(String[] args) {
		TestC c = new TestC();
		testB(c);
	}
}
