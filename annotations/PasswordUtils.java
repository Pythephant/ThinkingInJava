package annotations;

import java.util.List;

public class PasswordUtils {

	@UseCase(id = 47, description = "Passwords must contains at least one number.")
	public boolean validatePassword(String password) {
		return (password.matches("\\w*\\d\\w*"));
	}

	@UseCase(id = 48)
	public String encryptPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}

	@UseCase(id = 49, description = "New passwords can't equal the previous used ones.")
	public boolean checkForNewPassword(List<String> prePasswords, String password) {
		return !prePasswords.contains(password);
	}
}
