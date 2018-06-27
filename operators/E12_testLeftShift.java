package operators;

public class E12_testLeftShift {
	public static void main(String[] args) {
		int i = -1;
		System.out.println("i:" + i +",binary: "+Integer.toBinaryString(i));
		i <<= 1;
		System.out.println("signed left shift i: " + i + ",binary: " + Integer.toBinaryString(i));
		while(true) {
			i >>>= 1;
			System.out.println("unsigned right shift i: " + i + ", binary: " + Integer.toBinaryString(i));
			if(i==0)
				break;
		}
	}

}
