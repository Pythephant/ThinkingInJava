package operators;

public class E10_testBitOperator {
	public static void main(String[] args) {
		int b1 = 0xf0;
		int b2 = -0xff;
		testPrintWith0xFF(b1);
		testPrintWith0xFF(b2);
		
	}
	
	public static void testPrintWith0xFF(int b1) {
		int b1And = b1 & 0xff;
		int b1Or = b1 | 0xff;
		int b1Not = ~b1;
		System.out.println("int b1:" + b1+"(" + Integer.toBinaryString(b1)+")");
		System.out.println("\tbit and:" + Integer.toBinaryString(b1And));
		System.out.println("\tbit or:" + Integer.toBinaryString(b1Or));
		System.out.println("\tbit not:" + Integer.toBinaryString(b1Not));
	}
}
