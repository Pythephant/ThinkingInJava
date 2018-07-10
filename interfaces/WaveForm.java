package interfaces;

public class WaveForm {
	private static int counter;
	private final int id = counter++;
	private double length;

	public String toString() {
		return "WaveForm(" + id + ") lamda:" + length;
	}

	public WaveForm(double l) {
		length = l;
	}

	public double getLength() {
		return length;
	}

	public static void main(String[] args) {
		WaveFilterAdapter[] wfas = { new WaveFilterAdapter(new LowPass(5)), new WaveFilterAdapter(new HighPass(10)),
				new WaveFilterAdapter(new BandPass(5, 10)) };

		WaveForm[] waves = { new WaveForm(3), new WaveForm(7), new WaveForm(11) };

		for (WaveFilterAdapter wfa : wfas) {
			for (WaveForm w : waves)
				Aplly.process(wfa, w);
		}
	}
}

class WaveFilterAdapter implements Filter {

	WaveFilter wf;

	public WaveFilterAdapter(WaveFilter wf) {
		// TODO Auto-generated constructor stub
		this.wf = wf;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return wf.name();
	}

	@Override
	public WaveForm process(Object input) {
		// TODO Auto-generated method stub
		return wf.process((WaveForm) input);
	}

}

class WaveFilter {
	public String name() {
		return getClass().getSimpleName();
	}

	public WaveForm process(WaveForm input) {
		return input;
	}
}

class LowPass extends WaveFilter {
	private double cutoff;

	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}

	public WaveForm process(WaveForm input) {
		if (input.getLength() < cutoff)
			return input;
		else
			return null;
	}
}

class HighPass extends WaveFilter {
	private double cutoff;

	public HighPass(double cutoff) {
		this.cutoff = cutoff;

	}

	public WaveForm process(WaveForm input) {
		if (input.getLength() > cutoff)
			return input;
		else
			return null;
	}
}

class BandPass extends WaveFilter {
	private double lowCutoff, highCutoff;

	public BandPass(double low, double high) {
		lowCutoff = low;
		highCutoff = high;
	}

	public WaveForm process(WaveForm input) {
		if (input.getLength() > lowCutoff && input.getLength() < highCutoff)
			return input;
		else
			return null;
	}
}
