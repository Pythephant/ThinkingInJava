package reusing.classes;

public class E02_InheritFromDetergent extends Detergent{
	public void scrub(){
		append(" InheritDetergent scrub()");
		super.scrub();
	}
	
	public void sterilize(){
		append(" sterilize()");
	}
	
	public static void main(String[] args) {
		E02_InheritFromDetergent id = new E02_InheritFromDetergent();
		id.apply();
		id.scrub();
		id.sterilize();
		System.out.println(id);
	}
}
