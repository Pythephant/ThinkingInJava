package innerclass;

class Outer {
	private String oString;

	public Outer(String s) {
		oString = s;
	}

	class Inner {
		public void print() {
			System.out.println(getClass().getName());
		}

		public String toString() {
			return oString;
		}
	}

	public Inner getInner() {
		return new Inner();
	}
}

public class E01_InnerOuterClass {
	public static void main(String[] args) {
		Outer o = new Outer("Jason");
		Outer.Inner i = o.getInner();
		System.out.println(i);
	}
}
