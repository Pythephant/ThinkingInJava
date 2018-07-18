package holding;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListFeature {
	public static void main(String[] args) {
		LinkedList<String> pets = new LinkedList<>();
		pets.addAll(Arrays.asList("Rat", "Manx", "Cymric", "Mutt", "Pug"));
		System.out.println(pets);
		// pets.clear();
		System.out.println("pets.peek():" + pets.peek()); // in empty list peek
															// return null
		System.out.println("pets.getFirst():" + pets.getFirst());
		System.out.println("pets.element():" + pets.element());
		/**
		 * in empty list getFirst and element throws nosuchelementexception
		 */

		System.out.println("pets.remove():" + pets.remove());
		System.out.println("pets.removeFirst():" + pets.removeFirst());
		System.out.println("pets.poll():" + pets.poll());
		System.out.println(pets);

		pets.addFirst("Rat");
		System.out.println("pets after addfirst():" + pets);
		pets.offer("aaa");
		System.out.println("after offer():" + pets);
		pets.add("last");
		System.out.println("after add():" + pets);
		pets.addLast("addLast");
		System.out.println("after addLast():" + pets);
		System.out.println("pets.removeLast():" + pets.removeLast());
	}
}
