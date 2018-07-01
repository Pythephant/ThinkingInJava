package initialization.cleanup;

import static net.mindview.util.Print.*;

public class StaticInitialization {
	public static void main(String[] args) {
		print("Creating Cupboard in main");
		new Cupboard();
		print("Createing Cupboard in main");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);

		CupboardParent cp = new Cupboard();
	}

	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();
}

class Bowl {
	Bowl(int marker) {
		print("Bowl(" + marker + ")");
	}

	static {
		print("Class Bowl is loaded");
	}

	void f1(int marker) {
		print("f1(" + marker + ")");
	}
}

class Table {
	static Bowl bowl1 = new Bowl(1);

	Table() {
		print("Table()");
		bowl2.f1(1);
	}

	void f2(int marker) {
		print("f2(" + marker + ")");
	}

	static Bowl bowl2 = new Bowl(2);

	static {
		print("Class Table is Loaded");
	}
}

class CupboardParent {
	static {
		print("Class CupboardParent is loaded");
	}
}

class Cupboard extends CupboardParent {
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);

	Cupboard() {
		print("Cupboard()");
		bowl4.f1(2);
	}

	void f3(int marker) {
		print("f3(" + marker + ")");
	}

	static Bowl bowl5 = new Bowl(5);

	static {
		print("Class Cupboard is loaded");
	}
}
