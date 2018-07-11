package interfaces;

interface Service {
	void method1();

	void method2();

}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {
	Implementation1() {
	}

	public void method1() {
		System.out.println(getClass().getSimpleName() + ".method1()");
	}

	public void method2() {
		System.out.println(getClass().getSimpleName() + ".method2()");
	}
}

class Imple1Factory implements ServiceFactory {
	@Override
	public Service getService() {
		return new Implementation1();
	}
}

class Implementation2 implements Service {
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + ".method1()");
	}

	public void method2() {
		System.out.println(getClass().getSimpleName() + ".method2()");
	}
}

class Imple2Factory implements ServiceFactory {
	public Service getService() {
		return new Implementation2();
	}
}

public class Factories {
	public static void serviceConsumer(ServiceFactory fac) {
		Service s = fac.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(new Imple1Factory());
		serviceConsumer(new Imple2Factory());
	}
}
