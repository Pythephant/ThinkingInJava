package annotations.database;

@DBTable
public class Member {

	@SQLString(50)
	private String firstName;
	@SQLString(30)
	private String lastName;
	@SQLInteger
	private int age;
	@SQLString(value = 30, constraints = @Constraints(primaryKey = true))
	private String handle;

	private static int memberCount;

	public String getHandle() {
		return handle;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String toString() {
		return handle;
	}

	public int getAge() {
		return age;
	}

}
