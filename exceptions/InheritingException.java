package exceptions;

class SimpleException extends Exception {

}

public class InheritingException {

	public void f() throws SimpleException {
		System.out.println("Throw SimpleException in the InheritingException");
		throw new SimpleException();
	}

	public static void main(String[] args) {
		InheritingException ie = new InheritingException();
		try {
			ie.f();
		} catch (SimpleException e) {
			System.out.println("Catch exception in main:" + e);
		}
	}
}
