package polymorphism;

class RectangularGlyph extends Glyph {
	private int width = 5;
	private int height = 10;

	public RectangularGlyph(int width, int height) {
		System.out.println("At the very begining of constructor: width=" + this.width + ", height=" + this.height);
		this.width = width;
		this.height = height;
	}

	public void draw() {
		System.out.println("Rectangular.draw() , width=" + width + ",height=" + height);
	}
}

public class E15_RectangulaGlyph {
	public static void main(String[] args) {
		new RectangularGlyph(5, 5).draw();
	}
}
