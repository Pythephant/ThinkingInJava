package reusing.classes;

public class E09_ChildAndBaseHaveSameFields {
	public static void main(String[] args) {
		new Stem();
	}
}

class Root {
	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();

	public Root() {
		System.out.println("Construct Root");
//		System.out.println(this);
	}

	public String toString() {
		return "Root:" + c1 + c2 + c3;
	}
}

class Stem extends Root {
	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();

	public Stem() {
		System.out.println("Construct Stem");
//		System.out.println(super);
		System.out.println(this);
	}

	public String toString() {
		return "Stem:" + c1 + c2 + c3;
	}

}

class Component {
	private long time;

	public Component() {
		time = System.currentTimeMillis();
	}

//	public String toString() {
//		return "Created at " + this.time;
//	}

	public long getTime() {
		return time;
	}
}

class Component1 extends Component {

	public Component1() {
		System.out.println("Component1 at:" + this);
	}

}

class Component2 extends Component {

	public Component2() {
		System.out.println("Component2 at:" + this);
	}

}

class Component3 extends Component {

	public Component3() {
		System.out.println("Component3 at:" + this);
	}

}
