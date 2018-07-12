package innerclass;

interface Service {
	public void method1();

	public void method2();
}

interface ServiceFactory {
	public Service getService();
}

class Imple1 implements Service {

	public static ServiceFactory fact = new ServiceFactory() {

		@Override
		public Service getService() {
			// TODO Auto-generated method stub
			return new Imple1();
		}
	};

	@Override
	public void method1() {
		System.out.println("Implementation1.method1()");
	}

	@Override
	public void method2() {
		System.out.println("Implementation1.method2()");
	}

}

class Imple2 implements Service {
	public static ServiceFactory fact = new ServiceFactory() {

		@Override
		public Service getService() {
			// TODO Auto-generated method stub
			return new Imple2();
		}
	};

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Implementation2.method1()");
	}

	@Override
	public void method2() {
		System.out.println("Implementation2.mehtod2()");
	}

}

public class Factories {
	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(Imple1.fact);
		System.out.println("=================");
		serviceConsumer(Imple2.fact);
	}
}
