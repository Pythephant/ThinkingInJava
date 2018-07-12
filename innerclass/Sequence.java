package innerclass;

interface Selector {
	public boolean end();

	public Object current();

	public void next();
}

public class Sequence {
	private Object[] items;
	private int next = 0;

	public Sequence(int i) {
		items = new Object[i];
	}

	public void add(Object x) {
		if (next < items.length) {
			items[next] = x;
			next++;
		}
	}

	private class SequenceSelector implements Selector {

		private int i = 0;

		@Override
		public boolean end() {
			return i == next;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if (i < next)
				i++;
		}

	}

	public Selector selector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		Sequence s = new Sequence(11);
		for (int i = 0; i < 10; i++)
			s.add(i);
		Selector selector = s.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}
