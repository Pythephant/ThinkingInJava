package polymorphism;

class Shared {
	private int refcount = 0; // the reference of the object that had been use in other kind of class of
								// Objects
	private static long counter = 0; // the Object of Shared has been created
	private final long id; // the id of the SharedObject

	public Shared() {
		id = counter;
		counter++;
		System.out.println("Creating " + this);
	}

	public String toString() {
		return "Shared " + id;
	}

	public void addRef() {
		refcount++;
	}

	protected void dispose() {
		refcount--;
		if (refcount == 0)
			System.out.println("Disposing " + this);
	}

	protected void finalize() {
		if (refcount != 0) {
			System.out.println("Error: object is not properly cleaned-up!");
		}
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;

	public Composing(Shared shared) {
		System.out.println("Creating " + this);
		this.shared = shared;
		shared.addRef();
	}

	public void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}

	public String toString() {
		return "composing " + id;
	}
}

public class ReferenceCounting {
	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		Composing[] composings = { new Composing(s1), new Composing(s1), new Composing(s2), new Composing(s1),
				new Composing(s2), new Composing(s2) };
		for (Composing c : composings) {
			c.dispose();
		}
	}
}