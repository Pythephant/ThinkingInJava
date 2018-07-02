package initialization.cleanup;

public class E21_EmumOrdinal {
	public static void main(String[] args) {
		for(Jason j:Jason.values()) {
			System.out.println(j + ", ordinal:" + j.ordinal());
		}
	}
}
