package Ex05;

public interface UserActions {
    default void logActivity(String activity) {
        System.out.printf("User activity: %s%n", activity);
    }
}
