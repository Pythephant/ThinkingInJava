package exceptions;

class VeryImportantException extends Exception{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A very important exception";
	}
}

class ATrivalException extends Exception {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A trival exception";
	}
}

public class LostMessage {
	public void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	
	public void dispose() throws ATrivalException {
		throw new ATrivalException();
	}
	
	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			}finally {
				lm.dispose();
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	/**
	 * the VeryImportantException in the lm.f()
	 */
}
