package Ex05;

public interface AdminActions {
    default void logActivity(String activity) {
        System.out.printf("Admin activity: %s%n", activity);
    }
}
