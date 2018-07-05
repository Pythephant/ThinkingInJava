package reusing.classes;

public class E24_BeetleInherit {
	public static void main(String[] args) {
		System.out.println("in the main:");
		new RedBeetle();
	}
}

class RedBeetle extends Bettle {
	static int x3 = printInit("RedBeetle.x3 is initialized");
	private int l;
	public RedBeetle() {
		System.out.println("RedBeetle constructor");
		l = 3;
		System.out.println("j = "+ j + ", l = " + l);
	}
	static {
		System.out.println("print something in RedBeetle");
	}
}
