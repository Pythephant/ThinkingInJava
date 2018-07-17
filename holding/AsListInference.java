package holding;

import java.util.Arrays;
import java.util.List;

class Snow {
}

class Power extends Snow {
}

class Light extends Power {
}

class Heavy extends Power {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}

public class AsListInference {
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(new Snow(), new Power(), new Crusty());

		List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
	}
}
