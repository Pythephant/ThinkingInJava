package exceptions;

class DynamicFieldsException extends Exception {
}

public class DynamicFields {
	private Object[][] fields;

	public DynamicFields(int initialSize) {
		fields = new Object[initialSize][2];
		for (int i = 0; i < initialSize; i++) {
			fields[i] = new Object[] { null, null };
		}
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Object[] obj : fields) {
			result.append(obj[0]);
			result.append(": ");
			result.append(obj[1]);
			result.append(System.lineSeparator());
		}
		return result.toString();
	}

	private int hasField(String id) {
		for (int i = 0; i < fields.length; i++) {
			if (id.equals(fields[i][0]))
				return i;
		}
		return -1;
	}

	private int getFieldNumber(String id) throws NoSuchFieldException {
		int fieldNumber = hasField(id);
		if (fieldNumber == -1)
			throw new NoSuchFieldException();
		return fieldNumber;
	}

	private int makeField(String id) {
		for (int i = 0; i < fields.length; i++) {
			if (fields[i][0] == null) {
				fields[i][0] = id;
				return i;
			}
		}
		Object[][] temp = new Object[fields.length * 2 + 1][2];
		for (int i = 0; i < fields.length; i++) {
			temp[i] = fields[i];
		}
		for (int i = fields.length; i < temp.length; i++) {
			temp[i] = new Object[] { null, null };
		}
		fields = temp;
		return makeField(id);

	}

	public Object getField(String id) throws NoSuchFieldException {
		return fields[getFieldNumber(id)][1];
	}

	public Object setField(String id, Object value) throws DynamicFieldsException {
		if (value == null) {
			DynamicFieldsException dfe = new DynamicFieldsException();
			dfe.initCause(new NullPointerException());
			throw dfe;
		}

		int fieldNumber = hasField(id);
		if (fieldNumber == -1)
			fieldNumber = makeField(id);
		Object result = null;
		try {
			result = getField(id);
		} catch (NoSuchFieldException e) {
			throw new RuntimeException(e);// throws a runtimeexception with
											// Nosuchfieldexception in it;

		}
		fields[fieldNumber][1] = value;
		return result;
	}

	public static void main(String[] args) {
		DynamicFields df = new DynamicFields(3);
		System.out.println(df);
		try {
			df.setField("d", "A value of d");
			df.setField("number", 1);
			df.setField("number2", 2);
			System.out.println(df);
			df.setField("d", "A new value of d");
			df.setField("number3", 33.3);
			System.out.println("Df:" + df);
			System.out.println("df.getField(\"d\"):" + df.getField("d"));
			Object dv = df.setField("d", null);
		} catch (NoSuchFieldException e) {
			e.printStackTrace(System.out);
		} catch (DynamicFieldsException e) {
			e.printStackTrace(System.out);
		}
	}

}
