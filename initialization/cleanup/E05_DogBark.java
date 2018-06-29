package initialization.cleanup;

public class E05_DogBark {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.bark(0.0);
		d.bark(0);
	}
}

class Dog {
	public void bark() {
		System.out.println("empty bark...");
	}
	
	public void bark(int i) {
		System.out.println("Integer bark:" + i);
	}
	
	public void bark(double i) {
		System.out.println("Double bark:" + i);
	}
}
