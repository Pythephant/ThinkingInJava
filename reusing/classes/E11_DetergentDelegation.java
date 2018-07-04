package reusing.classes;

public class E11_DetergentDelegation {
	public static void main(String[] args) {
		DetergentDelegation x = new DetergentDelegation();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
	}
}

class DetergentDelegation {
	private Cleanser cl;

	public DetergentDelegation() {
		cl = new Cleanser();
	}

	public String toString() {
		return cl.toString();
	}

	public void apply() {
		cl.apply();
	}

	public void scrub() {
		cl.append(" DetergentDelegation.scrub()");
		cl.scrub();
	}

	public void dilute() {
		cl.dilute();
	}

	public void foam() {
		cl.append(" foam()");
	}
}