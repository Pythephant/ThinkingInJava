package annotations;


public class Testable {
	public void execute() {
		System.out.println("executing...");
	}

	public void testExecute() {
		execute();
	}
}
