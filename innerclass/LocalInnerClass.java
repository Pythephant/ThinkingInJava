package innerclass;

interface Counter {
	public int next();
}

public class LocalInnerClass {
	private int count = 0;

	public Counter getCounter(String s) {
		class LocalCounter implements Counter {
			public LocalCounter() {
				System.out.println("LocalCounter()");
			}

			public int next() {
				System.out.print(s);
				return count++;
			}
		}

		return new LocalCounter();
	}

	public Counter getCounter2(String s) {
		return new Counter() {
			/**
			 * can't to specify the counter() constructor in the anonymous class just have
			 * to use the {} block to code
			 */
			// public void Counter() {
			// System.out.println("Anonymous Counter()");
			// }
			{
				System.out.println("Anonymous Counter()");
			}

			@Override
			public int next() {
				// TODO Auto-generated method stub
				System.out.print(s);
				return count++;
			}

			public Counter returnNewCounter() {
				return new Counter() {

					@Override
					public int next() {
						// TODO Auto-generated method stub
						System.out.println("Inner of the inner class");
						return 0;
					}

				};
			}

		};
	}

	public static Counter getCounter3(String s) {
		return new Counter() {

			{
				System.out.println("AnonymousClass Created by STATIC method");
			}

			@Override
			public int next() {
				// TODO Auto-generated method stub
				System.out.print(s);
				return 0;
			}
		};
	}

	public static void main(String[] args) {
		LocalInnerClass lic = new LocalInnerClass();
		Counter c1 = lic.getCounter("LocalInnerClass ");
		Counter c2 = lic.getCounter2("Anonymous Class ");
		System.out.println("========start to call next=============");
		for (int i = 0; i < 5; i++) {
			System.out.println(c1.next());
			System.out.println(c2.next());
		}

		Counter c3 = lic.getCounter3("Object calls the Static method ");
		System.out.println(c3.next());
	}

	/**
	 * LocalInnerClass have the access to the object of the outer class obj and the
	 * namespace of the method calls it;
	 */
}
