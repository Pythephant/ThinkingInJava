package innerclass;

public class TestStringAddr {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Jason");
		System.out.println(sb + ", " + sb.hashCode());
		sb.replace(0, sb.length(), "Canddi");
		System.out.println(sb + ", " + sb.hashCode());

		String s = "Jason";
		System.out.println(s + ", " + s.hashCode());
		s = "Canddi";
		System.out.println(s + ", " + s.hashCode());
	}
}
