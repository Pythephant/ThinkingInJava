package holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class PrintingContainer {
	public static Collection<String> fill(Collection<String> c) {
		System.out.println("Collection!");
		c.add("rat");
		c.add("cat");
		c.add("dog");
		c.add("dog");
		return c;
	}

	public static Map<String, String> fill(Map<String, String> m) {
		System.out.println("Map!");
		m.put("rat", "Fuzzy");
		m.put("cat", "Rags");
		m.put("dog", "Bosco");
		m.put("dog", "Spot");
		return m;
	}

	public static void main(String[] args) {
		System.out.println(fill(new ArrayList<>()));
		System.out.println(fill(new LinkedList<>()));
		System.out.println(fill(new HashSet<>()));
		System.out.println(fill(new TreeSet<>()));
		System.out.println(fill(new LinkedHashSet<>()));
		System.out.println(fill(new HashMap<String, String>()));
		System.out.println(fill(new TreeMap<String, String>()));
		System.out.println(fill(new LinkedHashMap<String, String>()));
	}
}
