package Ex03;

@FunctionalInterface
public interface Authenticatable {
    String getPassword();

    default boolean isAuthenticated() {
        String password = getPassword();
        return password != null && !password.isEmpty();
    }

    static String encrypt(String password) {
        return "ENC_" + password;
    }
}
