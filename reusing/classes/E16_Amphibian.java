package reusing.classes;

public class E16_Amphibian {
	public static void main(String[] args) {
		Frog f = new Frog();
		f.say();
		Amphibian a = (Amphibian) f;
		a.say();
	}
	/**
	 * Amphibian say()
	 * Amphibian say()
	 */
}

class Amphibian {
	public void say() {
		System.out.println("Amphibian say()");
	}
}

class Frog extends Amphibian {

}
