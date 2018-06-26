package everything.is.a.object;

public class E08_staticField {
	static int i;

	public static void main(String[] args) {
		E08_staticField obj = new E08_staticField();
		E08_staticField obj2 = new E08_staticField();
		System.out.println(obj.i);
		obj2.i++;
		System.out.println(E08_staticField.i);
	}
}
