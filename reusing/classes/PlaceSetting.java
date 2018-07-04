package reusing.classes;

class Plate {
	Plate(int i) {
		System.out.println("Plate constructor");
	}
}

class DinnerPlate extends Plate {
	DinnerPlate(int i) {
		super(i);
		System.out.println("DinnerPlate constructor");
	}
}

class Utensil {
	Utensil(int i) {
		System.out.println("Utensil constructor");
	}
}

class Spoon extends Utensil {
	Spoon(int i) {
		super(i);
		System.out.println("Spoon constructro");
	}
}

class Fork extends Utensil {
	Fork(int i) {
		super(i);
		System.out.println("Fork constructor");
	}
}

class Knife extends Utensil {
	Knife(int i) {
		super(i);
		System.out.println("Knife constructor");
	}
}

class Custom {
	Custom(int i) {
		System.out.println("Custom constructor");
	}
}

public class PlaceSetting extends Custom {
	private Spoon sp;
	private Fork fk;
	private Knife kn;
	private DinnerPlate pl;

	public PlaceSetting(int i) {
		super(i + 1);
		sp = new Spoon(i + 2);
		fk = new Fork(4 * i);
		kn = new Knife(2 * i);
		pl = new DinnerPlate(i);
		System.out.println("PlaceSetting constructor");
	}

	public static void main(String[] args) {
		new PlaceSetting(5);
	}
}
