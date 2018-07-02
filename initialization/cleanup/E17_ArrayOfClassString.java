package initialization.cleanup;

import java.sql.Time;
import java.util.Arrays;

public class E17_ArrayOfClassString {
	public static void main(String[] args) {
		S[] arr = new S[5]; // Don't print anything , because all the objects are nulls.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new S(Integer.toString(i)); // construct the S Objects so will print the String arguments
		}
		System.out.println(Arrays.toString(arr));
		// array constructs a list of reference that contains the references pointed to
		// the specific objects
	}
}

class S {
	public S(String s) {
		System.out.println(s);
	}
}
