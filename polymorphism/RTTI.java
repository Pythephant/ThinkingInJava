package polymorphism;

class Useful {
	void f() {
	}

	void g() {
	}
}

class MoreUseful extends Useful {
	void f() {
	}

	void g() {
	}

	void u() {
	}

	void v() {
	}
}

public class RTTI {
	public static void main(String[] args) {
		Useful[] x = { new Useful(), new MoreUseful() };
		x[0].f();
		x[1].f();

		((MoreUseful) x[1]).u();
		MoreUseful m = (MoreUseful) x[0]; // class cast exception
	}
}
