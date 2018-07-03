package reusing.classes;

class Game {
	public Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	public BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}

public class Chess extends BoardGame {
	public Chess() {
		super(11);
		System.out.println("Chess constructor");
	}
	
	public Chess(int i){
		this();
	}

	public static void main(String[] args) {
		new Chess(1);
	}
}
