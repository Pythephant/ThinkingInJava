package holding;

import java.util.ArrayList;

class Apple1 extends Apple {
}

class Apple2 extends Apple {

}

class Apple3 extends Apple {

}

class Apple4 extends Apple {

}

public class GenericAndUpcasting {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();
		apples.add(new Apple1());
		apples.add(new Apple3());
		apples.add(new Apple2());
		apples.add(new Apple());
		apples.add(new Apple4());
		for (Apple a : apples)
			System.out.println(a);
	}
}
