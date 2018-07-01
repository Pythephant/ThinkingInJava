package initialization.cleanup;

public class TerminationCondition {
	public static void main(String[] args) throws InterruptedException {
		Book novel = new Book(true);
		novel.checkIn();
		novel = null;
//		System.gc();
		new Book(true);	
		System.gc();	//force to garbage collected, than will call the finalize
		Thread.sleep(1000);
	}
}

class Book {
	boolean checkedOut;

	public Book(boolean checkOut) {
		this.checkedOut = checkOut;
	}

	void checkIn() {
		checkedOut = false;
	}

	protected void finalize() {
		if (this.checkedOut)
			System.out.println("Error: book should be checkedOut");
		else
			System.out.println("Yes");
	
	}
}