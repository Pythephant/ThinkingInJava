package polymorphism;

class Charateristic {
	 private String s;
	 public Charateristic(String s) {
		 this.s = s;
		 System.out.println("Creating Characteristc " + s);
	 }
	 protected void dispose() {
		 System.out.println("disposing Characteristc " + s);
	 }
}

class Description {
	 private String s;
	 Description(String s){
		 this.s = s;
		 System.out.println("Creating Description " + s);
	 }
	 protected void dispose() {
		 System.out.println("disposing Description " + s);
	 }
}

class LivingCreature {
	private Charateristic p = new Charateristic("is alive");
	private Description t = new Description("Basic living creature");
	LivingCreature(){
		System.out.println("LivingCreature()");
	}
	protected void dispose() {
		System.out.println("LivingCreature dispose");
		t.dispose();
		p.dispose();
	}
}

class Animal extends LivingCreature {
	private Charateristic p = new Charateristic("has heart");
	private Description t = new Description("Animal not Vegetable");
	Animal(){
		System.out.println("Animal()");
	}
	protected void dispose() {
		System.out.println("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal {
	private Charateristic p = new Charateristic("can live in water");
	private Description t = new Description("Both water and land");
	public Amphibian() {
		System.out.println("Amphibian()");
	}
	protected void dispose() {
		System.out.println("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

public class Frog extends Amphibian {
	private Charateristic p = new Charateristic("Croaks");
	private Description t = new Description("Eats Bugs");
	public Frog() {
		System.out.println("Frog()");
	}
	protected void dispose() {
		System.out.println("Frog dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	
	public static void main(String[] args) {
		Frog frog = new Frog();
		System.out.println("bye!");
		frog.dispose();
	}
}
