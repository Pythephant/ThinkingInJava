package innerclass;

public class Parcel8 {
	public Destination des(String s) {
		return new Destination() {
			private String label = s;

			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel8 p = new Parcel8();
		Destination d = p.des("Hello");
		System.out.println(d.readLabel());
	}
}
