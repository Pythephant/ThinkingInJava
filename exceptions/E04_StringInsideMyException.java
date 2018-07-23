package exceptions;

class MyExceptionWithString extends Exception {
	private String msg;

	public MyExceptionWithString() {

	}

	public MyExceptionWithString(String s) {
		super(s);
		msg = s;
	}

	public String getMsg() {
		return msg;
	}
}

public class E04_StringInsideMyException {
	public static void main(String[] args) {
		try {
			throw new MyExceptionWithString();
		} catch (MyExceptionWithString e) {
			System.out.println(e.getMsg());
		}
		try {
			throw new MyExceptionWithString("withString");

		} catch (MyExceptionWithString e) {
			System.out.println(e.getMsg());
		}

	}
}
