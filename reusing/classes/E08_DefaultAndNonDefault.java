package reusing.classes;

public class E08_DefaultAndNonDefault {
	public static void main(String[] args) {
		new ChildOfNonDefault();
	}
}

class NonDefault {
	public NonDefault(int i) {
		System.out.println("NonDefault Constructor:" + i);
	}
}

class ChildOfNonDefault extends NonDefault {

	public ChildOfNonDefault() {
		this(1);
		System.out.println("Child without arg");
	}

	public ChildOfNonDefault(int i) {
		super(i);
		System.out.println("Child with arg constructor");
	}

}
