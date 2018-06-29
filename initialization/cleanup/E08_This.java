package initialization.cleanup;

public class E08_This {
	public void func1() {
		func2();
		func2();
	}
	
	public void func2(E08_This this) {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		new E08_This().func1();
	}
}
