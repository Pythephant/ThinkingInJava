package operators;

public class E14_StringComparison {
	public static void compareStrings(String s1, String s2) {
		System.out.println(s1 + " == " + s2 + "; " + (s1 == s2));
		System.out.println(s1 + " != " + s2 + ": " + (s1 != s2));
		System.out.println(s1 + " equals " + s2 + ": " + s1.equals(s2));
	}

	public static void main(String[] args) {
		String s1 = new String("canddi");
		String s2 = "canddi";
		compareStrings(s1, s2);
	}
}
