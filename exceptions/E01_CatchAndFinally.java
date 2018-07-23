package exceptions;

public class E01_CatchAndFinally {
	public static void main(String[] args) {
		try {
			throw new Exception("Throwing");
		} catch (Exception e) {
			System.out.println("Catch:" + e.getMessage());
		} finally {
			System.out.println("Get into the finally clause");
		}
	}
}
