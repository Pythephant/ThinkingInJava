package annotations;

import java.lang.reflect.Method;

public class UseCaseTracker {

	public static void displayUseCase(Class<?> cl) {
		for (Method m : cl.getDeclaredMethods()) {
			UseCase uc = m.getAnnotation(UseCase.class);
			if (uc != null) {
				System.out.println(m.getName() + " : Found UseCase(" + uc.id() + "," + uc.description() + ")");
			}
		}
	}

	public static void main(String[] args) {
		UseCaseTracker.displayUseCase(PasswordUtils.class);
	}
}
