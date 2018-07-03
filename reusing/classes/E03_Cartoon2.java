package reusing.classes;

public class E03_Cartoon2 extends Drawing {

	// public E03_Cartoon2() {
	// System.out.println("Constructor Cartoon()");
	// }

	public static void main(String[] args) {
		new E03_Cartoon2();
		/**
		 * without the default constructor, Java will auto create a default
		 * consturctor for this class, and it will call the base default class
		 * first;
		 */
	}
}
