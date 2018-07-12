package innerclass;

public class DotThis {
	public void f() {
		System.out.println("DotThis.f()");
	}

	private class Inner {
		public DotThis outer() {
			return DotThis.this;
		}
	}

	public Inner inner() {
		return new Inner();
	}

	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner i1 = dt.inner();
		DotThis.Inner i2 = dt.inner();
		System.out.println("i1:" + i1 + ", i2:" + i2);
		System.out.println("i1.outer:" + i1.outer() + ", i2.outer:" + i2.outer());
		i1.outer().f();
	}
}
