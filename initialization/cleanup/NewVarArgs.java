package initialization.cleanup;

public class NewVarArgs {
	static void printArray(Object... objects) {
		for (Object o : objects) {
			System.out.print(o + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printArray(new Integer(48), new Integer(2), new Float(3.14), new Double(11.11));
		printArray(47, 3.14F, 11.11);
		printArray("one", "two", "three");
		printArray(new A(), new A(), new A());
		printArray(new Integer[] { 1, 2, 3, 4 });
		printArray();
		System.out.println("end");
	}
}

class A {
}