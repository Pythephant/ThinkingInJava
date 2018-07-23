package exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");

	public LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		System.err.println("--------------");
		logger.severe(trace.toString());
	}
}

public class LoggingExceptions {
	public static void main(String[] args) {
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Caught " + e);
		}

		System.err.println("***********");

		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Caught again " + e);
		}
	}

}
