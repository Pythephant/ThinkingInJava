package innerclass;

public class Parcel10 {
	public Destination dest(String dest, int miles, double price) {
		return new Destination() {

			private String label = dest;
			private double totPrice;

			{
				totPrice = Math.round(miles * price);
				if (totPrice > 100)
					System.out.println("over budget!");
			}

			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel10 p = new Parcel10();
		Destination d1 = p.dest("Xiapu", 10, 10.5);
		System.out.println(d1.readLabel());
		Destination d2 = p.dest("Dapeng", 5, 5);
		System.out.println(d2.readLabel());
	}
}
