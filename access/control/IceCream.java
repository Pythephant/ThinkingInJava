package access.control;

public class IceCream {
	public static void main(String[] args) {
		System.out.println(Sundae.makeASundae());
		System.out.println(Sundae.makeASundae());
	}
}

class Sundae {
	private static Sundae obj;

	private Sundae() {
	}

	public static Sundae makeASundae() {
		if (obj == null)
			obj = new Sundae();
		return obj;
	}
}