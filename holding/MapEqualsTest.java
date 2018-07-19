package holding;

import java.util.HashMap;
import java.util.Map;

class A {
	private String s;

	public A(String s) {
		this.s = s;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("-------");
		return this.s.equals(((A) obj).s);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return s.hashCode();
	}
}

public class MapEqualsTest {
	public static void main(String[] args) {
		Map<A, String> map = new HashMap<A, String>();
		map.put(new A("aa"), "first a");
		map.put(new A("bb"), "b");
		A a = new A("aa");
		String sa = map.get(a);
		System.out.println(sa);
	}
}
