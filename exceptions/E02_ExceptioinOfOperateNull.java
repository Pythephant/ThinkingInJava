package exceptions;

public class E02_ExceptioinOfOperateNull {
	public static void main(String[] args) {
		Object obj = null;
		try {
			obj.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
