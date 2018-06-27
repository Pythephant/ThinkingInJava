package operators;

import net.mindview.util.Print;

public class E02_objectAssignment {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 5.5;
		t2.level = 3.3;
		System.out.println("1: t1.level=" + t1.level + ", t2.level=" + t2.level);

		t1 = t2;
		System.out.println("After t1 = t2 assignment: t1.level=" + t1.level + ", t2.level=" + t2.level);

		t1.level = 0.555;
		System.out.println("After assign t1.level=0.555 after t1=t2, t1.level=" + t1.level + ", t2.level=" + t2.level);
	}
	/**
	 * primitive Type assignment is copy the value to the variable
	 * 
	 * Object Type assignment is copy the reference to the variable, thus operate
	 * the copy reference will affect the Object in the heap which is affecting the
	 * origin variable pointed object;
	 */
}

class Tank {
	double level;
}
