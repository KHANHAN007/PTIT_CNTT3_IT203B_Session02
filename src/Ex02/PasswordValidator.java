package Ex02;

@FunctionalInterface
public interface PasswordValidator {
    boolean isValid(String password);
}
