package exceptions;

class MyException extends Exception {
	public MyException() {

	}

	public MyException(String s) {
		super(s);
	}
}

public class FullConstructor {
	public static void f() throws MyException {
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}

	public static void g() throws MyException {
		System.out.println("Throwing MyExcetion('time') from g()");
		throw new MyException("Time:" + System.currentTimeMillis());
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}

		try {
			g();
		} catch (MyException e) {
			e.printStackTrace(System.err);
		}
	}
}
