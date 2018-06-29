package initialization.cleanup;

import static net.mindview.util.Print.*;

public class ClassOverload {
	void f1(Parent p) {
		printnb("f1(Parent) ");
	}

	void f1(Child c) {
		printnb("f1(Child) ");
	}

	void f1(GrandChild gc) {
		printnb("f1(GrandChild) ");
	}

	void f2(Child c) {
		printnb("f2(Child) ");
	}

	void f2(Parent p) {
		printnb("f2(Parent) ");
	}

	void f3(Parent p) {
		printnb("f3(Parent) ");
	}

	void testGrandChild() {
		GrandChild gc = new GrandChild();
		printnb("GrandChild: ");
		f1(gc);
		f2(gc);
		f3(gc);
		print();
	}

	void testChild() {
		Child gc = new Child();
		printnb("Child: ");
		f1(gc);
		f2(gc);
		f3(gc);
		print();
	}

	void testParent() {
		Parent gc = new Parent();
		printnb("Parent: ");
		f1(gc);
		f2(gc);
		f3(gc);
		print();
	}

	void testParentPointToChild() {
		Parent o = new Child();
		printnb("Parent Point to Child Object: ");
		f1(o);
		f2(o);
		f3(o);
		print();
	}

	public static void main(String[] args) {
		ClassOverload co = new ClassOverload();
		co.testGrandChild();
		co.testChild();
		co.testParent();
		co.testParentPointToChild(); 
		// Parent's reference point to the Specific Object is treated as the parent;
	}

}

class Parent {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Parent";
	}
}

class Child extends Parent {
	public String toString() {
		return "Child";
	}
}

class GrandChild extends Child {
	public String toString() {
		return "GrandChild";
	}
}
