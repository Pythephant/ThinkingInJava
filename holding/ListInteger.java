package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListInteger {
	public static void main(String[] args) {
		int[] is = { 1, 3, 4, 7, 4, 6, 5 };
		List<Integer> ints = new ArrayList<>();
		for (int i = 0; i < is.length; i++)
			ints.add(is[i]);
		System.out.println("1:" + ints);
		int i = 11;
		ints.add(i);
		System.out.println("2:" + ints);
		System.out.println("3:" + ints.contains(i));
		ints.remove(new Integer(i));
		Integer p = ints.get(2);
		System.out.println("4:" + p + " " + ints.indexOf(p));
		Integer ii = new Integer(111);
		System.out.println("5:" + ints.indexOf(ii));
		System.out.println("6:" + ints.remove(ii));
		System.out.println("7:" + ints.remove(p));
		System.out.println("8:" + ints);
		ints.add(3, new Integer(-55));
		System.out.println("9:" + ints);
		List<Integer> sub = ints.subList(1, 4); // [low, high)
		System.out.println("sublist:" + sub);
		System.out.println("10 containsAll:" + ints.containsAll(sub));
		Collections.sort(sub);
		System.out.println("sorted sub:" + sub);
		/**
		 * the change in the subList() sub list, will affect the original list
		 */
		System.out.println(ints);
		// Collections.sort(ints);
		// ints.add(2, 999);
		// System.out.println(sub);
		/**
		 * position change in the original list affect the sublist , will throw
		 * a concurrentModificationException
		 */
		// System.out.println(ints);
		// System.out.println(sub);
		// order is not important in containsAll
		System.out.println("11:" + ints.containsAll(sub));
		Collections.shuffle(sub, new Random(47));
		System.out.println("shuffled sub: " + sub);
		System.out.println("12:" + ints.containsAll(sub));
		List<Integer> copy = new ArrayList<>(ints);
		sub = Arrays.asList(ints.get(1), ints.get(4));
		System.out.println("sub:" + sub);
		copy.retainAll(sub);
		System.out.println("13:" + copy);
		copy = new ArrayList<>(ints);
		copy.remove(2);
		// System.out.println(ints);
		System.out.println("14:" + copy);
		copy.removeAll(sub);
		System.out.println("15:" + copy);
		copy.set(1, 11);
		System.out.println("16:" + copy);
		copy.addAll(2, sub);
		System.out.println("17:" + copy);
		System.out.println("18:" + ints.isEmpty());
		ints.clear();
		System.out.println("19:" + ints);
		// System.out.println("sub after ints clear:" + sub);
		System.out.println("20:" + ints.isEmpty());
		ints.addAll(sub);
		System.out.println("21:" + ints);
		Object[] o = ints.toArray();
		System.out.println("22:" + o[1]);
		Integer[] oa = ints.toArray(new Integer[0]);
		System.out.println("23:" + oa[1].toString());
	}
}
