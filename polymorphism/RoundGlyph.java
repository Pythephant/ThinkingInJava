package polymorphism;

class Glyph {
	public Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}

	public void draw() {
		System.out.println("Glyph.draw()");

	}
}

public class RoundGlyph extends Glyph {
	private int id = 1;
	private String s = "init";

	public RoundGlyph(int id, String s) {
		System.out.println("RoundGlyph.RoundGlyph(), id = " + this.id + ", s = " + this.s);
		this.id = id;
		this.s = s;
	}

	public void draw() {
		System.out.println("RoundGlyph.draw(), id = " + id + ", s=" + s);
	}

	public static void main(String[] args) {
		new RoundGlyph(5, "jason").draw();

	}
}
