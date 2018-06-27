package operators;

public class E11_signedRightShift {
	public static void main(String[] args) {
		int c = 0xff;
		System.out.println("c:" + c + "," + Integer.toBinaryString(c));
		while(true) {
			c >>= 1;
			System.out.println("signed right shift one bit:"+c+","+Integer.toBinaryString(c));
			if(c==0)
				break;
		}
	}
}
