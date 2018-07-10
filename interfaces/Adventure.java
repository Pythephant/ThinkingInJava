package interfaces;

import com.sun.corba.se.spi.orbutil.fsm.Action;

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {

	void fly();
}

interface CanFly2 {
	int fly();
}

class ActionCharacter {
	public void fight() {
		System.out.println("ActionCharacter.fight()");
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly/* , Canfly2 */ {

	/**
	 * can not implement two interface with the same name method but return the
	 * different type
	 */
	@Override
	public void fly() {
		System.out.println("hero.fly()");

	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("hero.swim()");
	}

}

public class Adventure {
	public static void t(CanFly x) {
		x.fly();
	}

	public static void u(CanSwim x) {
		x.swim();
	}

	public static void v(CanFight x) {
		x.fight();
	}

	public static void w(ActionCharacter x) {
		x.fight();
	}

	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
	}
}
