package everything.is.a.object;

public class E10_stringCmdLine {
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Command line arguments are less than three!");
			return;
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("(" + (i + 1) + ")" + args[i]);
		}
	}
}
