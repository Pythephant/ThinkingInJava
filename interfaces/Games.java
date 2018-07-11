package interfaces;

interface Game {
	public boolean move();

}

interface GameFactory {
	public Game getGame();
}

class Checker implements Game {
	private int moves = 0;
	private static final int MOVES = 3;

	public boolean move() {
		moves++;
		System.out.println("Checker move " + moves);
		return moves < MOVES;
	}
}

class CheckerFactory implements GameFactory {
	@Override
	public Game getGame() {
		return new Checker();
	}
}

class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;

	public boolean move() {
		moves++;
		System.out.println("Chess move " + moves);
		return moves < MOVES;
	}
}

class ChessFactory implements GameFactory {
	public Game getGame() {
		return new Chess();
	}
}

public class Games {
	public static void playGame(GameFactory gf) {
		Game g = gf.getGame();
		while (g.move()) {

		}
	}

	public static void main(String[] args) {
		playGame(new CheckerFactory());
		playGame(new ChessFactory());
	}
}
