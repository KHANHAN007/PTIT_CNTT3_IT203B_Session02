package Practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = UserManagement.userSupplier.get();
        user = new User("khanhan", "khanhan@gmail.com", "ADMIN", "ACTIVE");
        boolean valid = IUserAccount.isStandardLength(user.getUsername());
        System.out.println("Username hợp lệ: " + valid);
        String email = UserManagement.getEmail.apply(user);
        System.out.println("Email: " + email);
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(new User("an12345", "an@gmail.com", "USER", "ACTIVE"));
        users.add(new User("binh567", "binh@gmail.com", "USER", "INACTIVE"));
        users.add(new User("admin999", "admin@gmail.com", "ADMIN", "ACTIVE"));
        users.forEach(System.out::println);

    }
}