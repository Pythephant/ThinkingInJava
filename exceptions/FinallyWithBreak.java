package exceptions;

public class FinallyWithBreak {
	public static void main(String[] args) {
		int count = 0;
		while(true) {
			try {
				if(count++ == 0) {
					throw new Exception();
				}
				System.out.println("Not throwing exception");
				break;
			}catch(Exception e) {
				System.out.println("Catch the exception");
			}finally {
				System.out.println("The finally " + count);
			}
		}
	}
}
