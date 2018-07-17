package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInts = { 6, 7, 8, 9, 10 };
		collection.addAll(Arrays.asList(moreInts));
		collection.add(11);
		Collections.addAll(collection, 12, 13, 14);
		Collections.addAll(collection, moreInts);

		System.out.println(collection);

		List<Integer> list = Arrays.asList(moreInts);
		list.set(0, 99);
		System.out.println(list);
		list.add(1000);
	}
}
