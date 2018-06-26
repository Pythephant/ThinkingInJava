package everything.is.a.object;

public class DefaultTypeOfIntAndChar {

	int a;
	char b;
	
	public static void main(String[] args) {
		DefaultTypeOfIntAndChar obj = new DefaultTypeOfIntAndChar();
		System.out.println("a:" + obj.a + ", b:" + obj.b);
		System.out.println("\\u"+Integer.toHexString((int)obj.b));
	}
}
