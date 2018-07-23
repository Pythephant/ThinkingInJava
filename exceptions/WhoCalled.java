package exceptions;

public class WhoCalled {
	public static void f() {
		try {
			throw new Exception();
		} catch (Exception e) {
			for (StackTraceElement stl : e.getStackTrace()) {
				System.out.println(stl);

			}
		}
	}

	static void g() {
		f();
	}

	static void h() {
		g();
	}

	public static void main(String[] args) {
		f();
		System.out.println("----------------");
		g();
		System.out.println("----------------");
		h();
	}
}
