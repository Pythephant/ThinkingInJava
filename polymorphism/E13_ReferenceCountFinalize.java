package polymorphism;

public class E13_ReferenceCountFinalize {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composings = { new Composing(shared), new Composing(shared), new Composing(shared) };
		for (Composing c : composings)
			c.dispose();
		System.gc();
		new Composing(new Shared());
		System.gc();
	}
}
