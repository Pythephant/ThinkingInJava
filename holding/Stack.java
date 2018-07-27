package holding;

import java.util.LinkedList;

public class Stack<E> {
	private LinkedList<E> storage = new LinkedList<>();

	public void push(E v) {
		storage.addFirst(v);
	}

	public E peek() {
		return storage.getFirst();
	}

	public E pop() {
		return storage.removeFirst();
	}

	public boolean isEmpyt() {
		return storage.isEmpty();
	}

	public String toString() {
		return storage.toString();
	}
}
