package polymorphism;

public class E10_BaseOneCallTwo {
	public static void main(String[] args) {
		Parent p = new Child();
		p.one();
	}
}

class Parent {
	public void one() {
		System.out.println("Parent.one() calls two()");
		two();
	}

	public void two() {
		System.out.println("Parent.two()");
	}
}

class Child extends Parent{
	public void two(){
		System.out.println("Child.two()");
	}
}