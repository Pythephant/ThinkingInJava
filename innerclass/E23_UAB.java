package innerclass;

interface U {
	public void u();

	public void v();

	public void w();
}

class A {
	private int i;

	public A(int i) {
		this.i = i;
	}

	public U getU() {
		return new U() {

			@Override
			public void w() {
				// TODO Auto-generated method stub
				System.out.println("A return U.w():" + i);
			}

			@Override
			public void v() {
				// TODO Auto-generated method stub
				System.out.println("A return U.v():" + i);
			}

			@Override
			public void u() {
				// TODO Auto-generated method stub
				System.out.println("A return U.u():" + i);
			}
		};
	}
}

class B {
	private U[] items;
	private int N;

	public B() {
		items = new U[2];
	}

	private void resize(int capacity) {
		U[] temp = new U[capacity];
		for (int i = 0; i < N; i++)
			temp[i] = items[i];
		items = temp;
	}

	public void add(U u) {
		if (N >= items.length)
			resize(2 * N + 1);
		items[N] = u;
		N++;
	}

	public U remove(int i) {
		if (i < 0 || i > N)
			throw new IllegalArgumentException(i + ", is beyond the range!");
		U item = items[i];
		for (int j = i; j < N - 1; j++)
			items[j] = items[j + 1];
		N--;
		return item;
	}

	public void moveThrough() {
		for (int i = 0; i < N; i++) {
			U u = items[i];
			u.u();
			u.v();
			u.w();
		}

	}
}

public class E23_UAB {
	public static void main(String[] args) {
		A[] arr = new A[5];
		B b = new B();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new A(i);
			b.add(arr[i].getU());
		}
		b.moveThrough();
		System.out.println("---------------------");
		b.remove(3);
		b.moveThrough();

	}
}
