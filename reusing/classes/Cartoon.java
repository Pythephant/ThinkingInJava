package reusing.classes;

class Art {
	public Art() {
		System.out.println("Constructor Art()");
	}

}

class Drawing extends Art {
	public Drawing() {
		System.out.println("Constructor Drawing()");
	}
}

public class Cartoon extends Drawing {

	public Cartoon() {
		System.out.println("Constructor Cartoon()");
	}

	public static void main(String[] args) {
		new Cartoon();
	}
}
