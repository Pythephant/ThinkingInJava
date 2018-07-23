package exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class Exception1 extends Exception {
	private static Logger logger = Logger.getLogger("Exception1111");

	public Exception1() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
		logger.info("After Sever");
	}
}

class Exception2 extends Exception {

	private static Logger logger = Logger.getLogger("Exception22222");

	public Exception2() {
		log();
	}

	public Exception2(String msg) {
		super(msg);
		log();
	}

	public void log() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
		logger.info("after sever");
	}
}

public class E06_TwoExceptionsLog {
	public static void main(String[] args) {
		try {
			throw new Exception1();
		} catch (Exception e) {
			System.err.println("Caught Ex1:" + e);
		}

		try {
			throw new Exception2();
		} catch (Exception e) {
			System.err.println("Caught Ex2 without msg:" + e);
		}

		try {
			throw new Exception2("lalalaalal");
		} catch (Exception e) {
			System.err.println("Caught Ex2 with msg:" + e);
		}
	}
}
