package polymorphism;

class Meal {
	public Meal() {
		System.out.println("Meal()");
	}
}

class Bread {
	public Bread() {
		System.out.println("Bread()");
	}
}

class Cheese {
	public Cheese() {
		System.out.println("Cheese()");
	}
}

class Lettuce {
	public Lettuce() {
		System.out.println("Lettuce()");
	}
}

class Lunch extends Meal {
	public Lunch() {
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch {
	public PortableLunch() {
		System.out.println("PortableLunch()");
	}
}

class Vegetable {
	public Vegetable() {
		System.out.println("Vegetable()");
	}
}

class Pickle extends Vegetable{
	public Pickle() {
		// TODO Auto-generated constructor stub
		System.out.println("Pickle()");
	}
}

public class Sandwich extends PortableLunch{
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	private Vegetable p = new Pickle();
	public Sandwich() {
		System.out.println("Sandwich()");
	}
	
	public static void main(String[] args) {
		new Sandwich();
	}
}
