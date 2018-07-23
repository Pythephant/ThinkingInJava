package exceptions;

public class Rethrowing {
	public static void f() throws Exception {
		System.out.println("Originate Exception in f()");
		throw new Exception("Thrown from f()");
	}

	public static void g() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside g() printStackTrace:");
			e.printStackTrace(System.out);
			throw e;
		}
	}

	public static void h() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside h() printStackTrace:");
			e.printStackTrace(System.out);
			throw (Exception) e.fillInStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			g();
		} catch (Exception e) {
			System.out.println("In main printStackTrace():");
			e.printStackTrace(System.out);
		}

		try {
			h();
		} catch (Exception e) {
			System.out.println("In main printStackTrace():");
			e.printStackTrace(System.out);
		}
	}

}
