package operators;

public class E03_PassObject {

	static void f(Letter y) {
		y.c = 'z';
	}

	static void g(Letter y) {
		y = new Letter();
		y.c = 'n';
	}

	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("1:x.c=" + x.c);
		f(x);
		System.out.println("2:after f(x), x.c=" + x.c);
		g(x);	//x.c not changing to 'n'
		System.out.println("3: after g(x), x.c=" + x.c);	
	}
	/**
	 * method or function argument pass the COPY of the reference of the object, so
	 * manipulate the object will affect the origin. but if assignment to the
	 * argument ,will not change the object;
	 */
}

class Letter {
	char c;
}