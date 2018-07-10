package interfaces;

public interface Filter {
	public String name();

	public Object process(Object input);
}
