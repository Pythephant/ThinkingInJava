package initialization.cleanup;

public class E04_OverloadConstructor {
	public E04_OverloadConstructor() {
		System.out.println("Constructor with no argument!");
	}
	
	public E04_OverloadConstructor(String s) {
		System.out.println("Constructor with String:" + s);
	}
	
	public static void main(String[] args) {
		new E04_OverloadConstructor("abc");
	}
}
