package initialization.cleanup;

public class MethodInit {
	// int s1 = g(j); //can not compile, because of the j is not defined yet
	int s2 = g(this.j); // can compile but get the wrong number, because at this
						// time the this.j is 0,so the s2 will be zero
	int i = f();
	int j = g(i);

	int f() {
		return 11;
	}

	int g(int n) {
		return n * 10;
	}

	public static void main(String[] args) {
		MethodInit mi = new MethodInit();
		System.out.println("mi.i:" + mi.i + ", mi.j:" + mi.j);
		System.out.println(mi.s2);
	}
}
