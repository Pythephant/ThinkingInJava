package polymorphism;

public class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind play() at " + n);
	}
}

class Blow extends Instrument {

}
