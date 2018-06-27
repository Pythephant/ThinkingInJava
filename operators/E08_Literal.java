package operators;

public class E08_Literal {
	public static void main(String[] args) {
		long i1 = 0x2f;
		System.out.println("i1:"+Long.toBinaryString(i1));
		
		long i2 = 0x2F;
		System.out.println("i2:"+Long.toBinaryString(i2));
		
		long i3 = 0117;
		System.out.println("i3:" + Long.toBinaryString(i3));
		
		char c = 0xffff;
		System.out.println("c: "+Integer.toBinaryString(c));
		
		byte b = 0x7f;
		System.out.println("b: " + Integer.toBinaryString(b));
		
		short s = 0x7fff;
		short s2 = -0x7fff;
		System.out.println("s: " + Integer.toBinaryString(s) + ", s2: " + Integer.toBinaryString(s2));
		
		long n1 = 200L;
		long n2 = 200l;
		long n3 = 200;
		
		float f1 = 1;
		float f2 = 1F;
		float f3 = 1f;
		
		double d1 = 1d;
		double d2 = 1D;
		double d3 = 1;
	}
}
