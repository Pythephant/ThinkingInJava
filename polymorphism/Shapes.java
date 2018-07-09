package polymorphism;

import java.util.Random;

public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	
	public static void main(String[] args) {
		Shape[] shapes = new Shape[9];
		for(int i = 0;i<shapes.length;i++){
			shapes[i] = gen.next();
		}
		for(Shape s : shapes)
			s.erase();
	}
}

class Shape {
	public void draw() {

	}

	public void erase() {
		System.out.println("Shape.erase()");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}

}

class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Square.draw()");
	}
	@Override
	public void erase() {
		System.out.println("Square.erase()");
	}
}

class Triangel extends Shape {
	@Override
	public void draw() {
		System.out.println("Triangel.draw()");
	}
	
	@Override
	public void erase() {
		System.out.println("Triangel.erase()");
	}
}

class RandomShapeGenerator {
	private Random rand = new Random(47);

	public Shape next() {
		switch (rand.nextInt(3)) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangel();
		}
	}
}
