package polymorphism;

public class E01_RideCycle {
	public static void ride(Cycle c) {
		c.run();
	}

	public static void main(String[] args) {
		ride(new Unicycle());
		ride(new Bicycle());
		ride(new Tricycle());
	}
}

abstract class Cycle {
	abstract public void run();
}

class Unicycle extends Cycle {

	@Override
	public final void run() {
		System.out.println("Unicycle.run()");

	}

}

class Bicycle extends Cycle {
	public final void run() {
		System.out.println("Bicycle.run()");
	}
}

class Tricycle extends Cycle {
	public final void run() {
		System.out.println("Tricycle.run()");
	}
}