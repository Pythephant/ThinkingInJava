package reusing.classes;

public class E17_AmphibianOverride {
	public static void main(String[] args) {
		Frog2 f = new Frog2();
		f.say();
		Amphibian a = (Amphibian) f;
		a.say();
	}
	/**
	 * Frog Say()
	 * Frog Say()
	 */
}

class Frog2 extends Amphibian{
	public void say() {
		System.out.println("Frog Say()");
	}
}
