package exceptions;

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

abstract class Inning {
	public Inning() throws BaseballException {
	}

	public void event() throws BaseballException {

	}

	public abstract void atBat() throws Strike, Foul;

	public void walk() {
	}
}

interface Storm {
	public void event() throws RainedOut;

	public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {

	/**
	 * constructor must throw the exactly the same exception or the baseException of
	 * the base class, "not" the child exception of the exception of thrown by the
	 * base class. after the restriction of the base class's exception is
	 * complemented , then other exceptions are free to throw
	 */
	public StormyInning() throws Exception, Foul, RainedOut {
	}

	public StormyInning(String s) throws BaseballException {

	}

	public void rainHard() {
	}

	public void walk() /* throws Exception */ {
		/*
		 * can't throws exception in the child class override method for there no
		 * exception throws in the base class, and in the "Old" code may not catch the
		 * exception thrown by the child class
		 */
	}

	public void event()  {

	}

	public void atBat() {

	}

}
