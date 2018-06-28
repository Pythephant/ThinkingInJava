package controlling.execution;

public class E09_fibonacci {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for(int i=0;i<n;i++) {
			System.out.print(fibonacci(i)+",");
		}
	}
	
	public static int fibonacci(int n) {
		if(n<=1)
			return 1;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
}
