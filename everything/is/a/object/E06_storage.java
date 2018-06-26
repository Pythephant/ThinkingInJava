package everything.is.a.object;

public class E06_storage {
	String s = "hello world";
	
	int storage(){
		return s.length() * 2;
	}
	
	public static void main(String[] args) {
		E06_storage st = new E06_storage();
		System.out.println("st.s.lenth():" + st.s.length());
		System.out.println("St.storage():" + st.storage());
	}
}
