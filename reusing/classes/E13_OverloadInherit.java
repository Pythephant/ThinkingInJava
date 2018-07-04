package reusing.classes;

public class E13_OverloadInherit extends Base{
	public int print(String s) {
		System.out.println("print(String)" + s);
		return 0;
	}
	public void print(E13_OverloadInherit e) {
		System.out.println("print(E13)" + e);
	}
	
	public static void main(String[] args) {
		Base b = new E13_OverloadInherit();
		E13_OverloadInherit e = new E13_OverloadInherit();
		//test b to print
		b.print(e);
		b.print(b);
		b.print(1.1);
		b.print(1);
		b.print('x');
		
		System.out.println("-----------------");
		//test e to print
		e.print(b);
		e.print(e);
		e.print(1.1);
		e.print(1);
		e.print("x");
		e.print('x');
	}
}

class Base {
	public void print(int i) {
		System.out.println("print(int)" + i);
	}
	
	public void print(double i) {
		System.out.println("print(double)"+ i);
	}
	
	public void print(Base b) {
		System.out.println("print(Base)" + b);
	}
}
