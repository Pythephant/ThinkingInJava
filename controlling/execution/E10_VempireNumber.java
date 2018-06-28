package controlling.execution;

public class E10_VempireNumber {
	public static void main(String[] args) {
		int[] startDigit = new int[4];
		int[] productDigit = new int[4];
		for (int num1 = 10; num1 < 100; num1++) {
			for (int num2 = num1; num2 < 100; num2++) {
				// if (num1 * num2) %9 != (num1+num2)%9 is not the Vempire number
				int product = num1 * num2;
				if ((product) % 9 != (num1 + num2) % 9)
					continue;
				startDigit[0] = num1 /10;
				startDigit
			}
		}
	}
}
