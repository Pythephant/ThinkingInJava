package controlling.execution;

import static net.mindview.util.Print.*;
import static access.control.E01_PrintOutside.*;
import access.control.*;
public class TestAccessControlPakage {
	public static void main(String[] args) {
//		print(1);	//collide happens
		access.control.E01_PrintOutside.print(1);
		net.mindview.util.Print.print("1");
//		Sundae s = Sundae.makeASundae();	can't find sundae class
		IceCream ic = new IceCream();	//can find the public class
	}
}
