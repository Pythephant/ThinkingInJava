package initialization.cleanup;

public class E06_DogBark2 {
	public static void main(String[] args) {
		Dog2 d = new Dog2();
		d.bark();
		d.bark(1,"one");
		d.bark("two", 2);
	}
}

class Dog2 {
	public void bark() {
		System.out.println("empty bark...");
	}
	
	public void bark(int i, String s) {
		System.out.println("Integer bark:" + i + ", followed String bark:" + s);
	}
	
	public void bark(String s, int i) {
		System.out.println("String bark:" + i + ", followed Integer bark:" + i);
	}
}
