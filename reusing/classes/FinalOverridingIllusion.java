package reusing.classes;

class WithFinals {
	private void f() {
		System.out.println("WithFinals f()");
	}

	private final void g() {
		System.out.println("WithFinals g()");
	}

	public void play() {
		f();
		g();
	}
}

class OverridingPrivate extends WithFinals {
//	@Override   //using @Override will see the private final
	public final void f() {
		System.out.println("Overriding Private f()");
	}
	// can override the f() because the private can't be seen here, that's not call
	// override, just design a new method f()

	public final void g() {
		System.out.println("OverridingPrivate g()");
	}

	public void play() {
		f();
		g();
		super.play();
	}
}

class OverridingFinal extends OverridingPrivate {
	// public final void f() {
	// System.out.println();
	// }
	// can not be override because the f() in the base class are final
	public void play() {
		System.out.println("OverridingFinal play()");
		super.play();
	}
}

public class FinalOverridingIllusion {
	public static void main(String[] args) {
		WithFinals wf = new WithFinals();
		wf.play();
		System.out.println("----------------------");
		WithFinals op = new OverridingPrivate();
		op.play();
		System.out.println("----------------------");
		WithFinals of = new OverridingFinal();
		of.play();
	}
}
