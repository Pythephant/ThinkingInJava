package initialization.cleanup;

public class E02_InitInDefineOrConsturctor {
	String str1 = "str1";
	String str2 ;
	
	public E02_InitInDefineOrConsturctor() {
		System.out.println("str1 in the constructor:" + str1);
		System.out.println("str2 in the constructor:" + str2);
		str2 = "str2";
	}
	
	public static void main(String[] args) {
		E02_InitInDefineOrConsturctor obj = new E02_InitInDefineOrConsturctor();
		System.out.println("str1 in main:" + obj.str1);
		System.out.println("str2 in main:" + obj.str2);
	}
	/**
	 *  field initialize in the defination , it will init before the Constructor
	 *  
	 */
}
