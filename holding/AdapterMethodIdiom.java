package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReverseArrayList<E> extends ArrayList<E> {
	public ReverseArrayList(Collection<E> c) {
		super(c);
	}

	public Iterable<E> reversed() {

		return new Iterable<E>() {

			@Override
			public Iterator<E> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<E>() {
					int current = size() - 1;

					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return current >= 0;
					}

					@Override
					public E next() {
						// TODO Auto-generated method stub
						return get(current--);
					}
				};

			}
		};

	}
}

public class AdapterMethodIdiom {
	public static void main(String[] args) {
		ReverseArrayList<String> l = new ReverseArrayList<String>(Arrays.asList("To be or not to be".split(" ")));
		for (String s : l) {
			System.out.print(s + " ");
		}
		System.out.println();
		for (String s : l.reversed())
			System.out.print(s + " ");

	}
}
