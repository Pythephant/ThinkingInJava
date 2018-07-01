package initialization.cleanup;

public class InitialValues {
	boolean t;
	char c;
	short s;
	int i;
	long l;
	float f;
	double d;
	byte b;
	InitialValues reference;

	void printInitialValues() {
		System.out.println("Data Types		InitialValues:");
		System.out.println("boolean			" + t);
		System.out.println("char			" + "[" + c + "]");
		System.out.println("byte			" + b);
		System.out.println("short			" + s);
		System.out.println("int			" + i);
		System.out.println("long			" + l);
		System.out.println("float			" + f);
		System.out.println("double			" + d);
		System.out.println("Reference		" + reference);
	}

	public static void main(String[] args) {
		InitialValues iv = new InitialValues();
		iv.printInitialValues();
		System.out.println("===================");
		new InitialValues().printInitialValues();
	}
}
