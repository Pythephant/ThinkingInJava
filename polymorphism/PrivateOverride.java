package polymorphism;

public class PrivateOverride {
	private void print() {
		System.out.println("PrivateOverride.print()");
	}

	public static void main(String[] args) {
		PrivateBase pb = new Derived();
		// pb.print(); //can not find the print() method , because the
		// PrivateBase.print is private, can't see outside its class
		PrivateOverride po = new DDerived();
		po.print();// can find print because main is in the PrivateOverride
					// class, but override fail, because the public void print()
					// in DDerived is a prenty new method
	}
}

class DDerived extends PrivateOverride {
	public void print() {
		System.out.println("DDerived.print()");
	}
}

class PrivateBase {
	private void print() {
		System.out.println("PrivateBase.print()");
	}
}

class Derived extends PrivateBase {
	public void print() {
		System.out.println("Derived.print()");
	}
}
