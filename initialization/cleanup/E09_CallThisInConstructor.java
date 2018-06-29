package initialization.cleanup;

public class E09_CallThisInConstructor {
	public static void main(String[] args) {
		new TestThis();
	}
}

class TestThis{
	public TestThis() {
		this("abc");
		System.out.println("Default blank constructor");
	}
	
	public TestThis(String s) {
		System.out.println("TestThis(String s):" + s);
	}
}
