package innerclass;

public class Parcel7 {
	public Content content() {
		return new Content() {
			private int i = 11;

			@Override
			public int value() {
				// TODO Auto-generated method stub
				return i;
			}
		};

	}

	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Content c = p.content();
		System.out.println(c.value());
	}
}
