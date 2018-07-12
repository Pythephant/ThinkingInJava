package innerclass;

public class DotNew {
	private class Inner {
	}

	public static void main(String[] args) {
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
	}
}
