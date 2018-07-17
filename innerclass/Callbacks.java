package innerclass;

interface Incremental {
	public int increment();
}

class Callee1 implements Incremental {

	private int i;

	@Override
	public int increment() {
		// TODO Auto-generated method stub
		System.out.println("=====================");
		System.out.println(i);
		i++;
		System.out.println("=====================");
		return i;
	}

}

class MyIncrement {
	public void increment() {
		System.out.println("other operation in MyIncrement");
	}

	public static void f(MyIncrement m1) {
		m1.increment();
	}
}

class Callee2 extends MyIncrement {
	private int i;

	public void increment() {
		System.out.println("===============");
		super.increment();
		System.out.println(i);
		i++;
		System.out.println("===============");
	}

	private class Closure implements Incremental {
		public int increment() {
			Callee2.this.increment();
			return i;
		}
	}

	public Incremental getCallbackRef() {
		return new Closure();
	}
}

class Caller {
	private Incremental ref;

	public Caller(Incremental ref) {
		this.ref = ref;
	}

	public int go() {
		return ref.increment();
	}
}

public class Callbacks {
	public static void main(String[] args) {
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		MyIncrement.f(c2);
		Caller caller1 = new Caller(c1);
		Caller caller2 = new Caller(c2.getCallbackRef());
		Caller caller3 = new Caller(c2.getCallbackRef());
		caller1.go();
		caller2.go();
		caller3.go();
		caller2.go();
	}
}
