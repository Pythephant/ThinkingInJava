package polymorphism;

public class Music {
	public void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Music m = new Music();
		m.tune(new Instrument());
		m.tune(new Wind());
		m.tune(new Blow());
	}

}
