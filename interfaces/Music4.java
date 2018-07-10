package interfaces;

import polymorphism.Note;

abstract class Instrument {
	private int i;

	public abstract void play(Note n);

	public String what() {
		return "Instrument";
	}

	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}

	public String what() {
		return "Wind";
	}

	public void adjust() {
		System.out.println("Wind.adjust()");
	}
}

class Percussion extends Instrument {
	public void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}

	public String what() {
		return "Percussion";
	}

	public void adjust() {
		System.out.println("Percussion.adjust()");
	}
}

class Stringed extends Instrument {
	public void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}

	public String what() {
		return "Stringed";
	}

	public void adjust() {
		System.out.println("Stringed.adjust()");
	}

}

class WoodWind extends Wind {
	public void play(Note n) {
		System.out.println("WoodWind.play() " + n);
	}

	public void adjust() {
		System.out.println("WoodWind.adjust()");
	}
}

class Brass extends Wind {

}

public class Music4 {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument... instruments) {
		for (Instrument i : instruments)
			tune(i);
	}

	public static void main(String[] args) {
		Instrument[] is = { new Wind(), new Percussion(), new Stringed(), new Brass(), new WoodWind() };
		tuneAll(is);
	}
}
