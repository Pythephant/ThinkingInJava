package interfaces;

import java.util.Arrays;

class Processor implements Filter{
	public String name() {
		return getClass().getSimpleName();
	}

	public Object process(Object input) {
		return input;
	}
}

class UpCase extends Processor {
	public String process(Object input) {
		return ((String) input).toUpperCase();
	}
}

class DownCase extends Processor {
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Splitter extends Processor {
	public String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
}

public class Aplly {
	public static void process(Filter p, Object s) {
		System.out.println("Using Filter: " + p.name());
		System.out.println(p.process(s));
	}

	public static String s = "Disagreement with beliefs is by defination incorrect";

	public static void main(String[] args) {
		process(new UpCase(), s);
		process(new DownCase(), s);
		process(new Splitter(), s);
	}
}


