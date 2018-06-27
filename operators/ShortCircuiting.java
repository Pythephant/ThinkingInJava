package operators;

public class ShortCircuiting {
	public static boolean test1(int i) {
		System.out.println("teat1(" + i + ")");
		System.out.println("result:" + (i < 1));
		return i < 1;
	}

	public static boolean test2(int i) {
		System.out.println("test2(" + i + ")");
		System.out.println("result:" + (i < 2));
		return i < 2;
	}

	public static boolean test3(int i) {
		System.out.println("test3(" + i + ")");
		System.out.println("result:" + (i < 3));
		return i < 3;
	}
	
	public static void main(String[] args) {
		boolean b = test1(0) && test2(2) && test3(2);
		System.out.println("expression is:" + b);
	}
}
