package initialization.cleanup;

import static net.mindview.util.Print.*;

public class PrimitiveOverload {
	void f1(char x) {
		printnb("f1(char) ");
	}

	void f1(byte x) {
		printnb("f1(byte)");
	}

	void f1(short x) {
		printnb("f1(short) ");
	}

	void f1(int x) {
		printnb("f1(int) ");
	}

	void f1(long x) {
		printnb("f1(long) ");
	}

	void f1(float x) {
		printnb("f1(float) ");
	}

	void f1(double x) {
		printnb("f1(double) ");
	}

	void f2(byte x) {
		printnb("f2(byte) ");
	}

	void f2(short x) {
		printnb("f2(short) ");
	}

	void f2(int x) {
		printnb("f2(int) ");
	}

	void f2(long x) {
		printnb("f2(long) ");
	}

	void f2(float x) {
		printnb("f2(float) ");
	}

	void f2(double x) {
		printnb("f2(double) ");
	}

	void f3(short x) {
		printnb("f3(short) ");
	}

	void f3(int x) {
		printnb("f3(int) ");
	}

	void f3(long x) {
		printnb("f3(long) ");
	}

	void f3(float x) {
		printnb("f3(float) ");
	}

	void f3(double x) {
		printnb("f3(double) ");
	}

	void f4(int x) {
		printnb("f4(int) ");
	}

	void f4(long x) {
		printnb("f4(long) ");
	}

	void f4(float x) {
		printnb("f4(float) ");
	}

	void f4(double x) {
		printnb("f4(double) ");
	}

	void f5(long x) {
		printnb("f5(long) ");
	}

	void f5(float x) {
		printnb("f5(float) ");
	}

	void f5(double x) {
		printnb("f5(double) ");
	}

	void f6(float x) {
		printnb("f6(float) ");
	}

	void f6(double x) {
		printnb("f6(double) ");
	}

	void f7(double x) {
		printnb("f7(double) ");
	}

	void testConsVal() {
		printnb("5: ");	//5 is treated as an int
		f1(5);	// calls the f1(int)
		f2(5);	// calls the f2(int)
		f3(5);	// calls the f3(int)
		f4(5);	//calls the f4(int)
		f5(5);	// f5 doesn't have an f5(int) calls the nearest f5(long)	
		f6(5);	// f6 doesn't have f6(int) or f6(long) calls the neareast f6(float)
		f7(5);	// calls the nearest cast f7(double)
		print();
	}

	void testConsFloat() {
		printnb("5.0: ");	// treated as a double, so all calls the fn(double)
		f1(5.0);
		f2(5.0);
		f3(5.0);
		f4(5.0);
		f5(5.0);
		f6(5.0);
		f7(5.0);
		print();
	}

	void testChar() {
		char x = 'x';	
		printnb("char: ");
		f1(x);	//f1(char)
		f2(x);	//f2 doesn't have a f2(char) change to f2(int)
		f3(x);	//f3 doesn't have a f3(char) change cast x to int , call the f3(int)
		f4(x);	// same as f3
		f5(x);	// doesn't have f5(char) , f5(int), call the f5(long)
		f6(x);	// call the nearest f6(float)
		f7(x);	// call the nearest f7(double)
		print();
	}

	void testByte() {
		byte x = 0;
		printnb("byte: ");
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7(x);
		print();
	}

	void testShort() {
		short x = 0;
		printnb("short: ");
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7(x);
		print();
	}

	void testInt() {
		int x = 0;
		printnb("int: ");
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7(x);
		print();
	}

	void testLong() {
		long x = 0;
		printnb("long: ");
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7(x);
		print();
	}

	void testFloat() {
		float x = 0;
		printnb("float: ");
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7(x);
		print();
	}

	void testDouble() {
		double x = 0;
		printnb("double: ");
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7(x);
		print();
	}
	
	public static void main(String[] args) {
		PrimitiveOverload p = new PrimitiveOverload();
		p.testConsVal();
		p.testConsFloat();
		p.testChar();
		p.testByte();
		p.testShort();
		p.testInt();
		p.testLong();
		p.testFloat();
		p.testDouble();
	}

}
