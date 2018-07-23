package exceptions;

public class E05_Resumption {
	public static void main(String[] args) {
		int i = 0;
		while (true) {
			try {
				if (i < 5)
					throw new Exception("try times:" + i);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			} finally {
				System.out.println("Finally at times:" + i);
				i++;
			}

			System.out.println("Corrected at " + i + " time");
			break;
		}
	}
}
