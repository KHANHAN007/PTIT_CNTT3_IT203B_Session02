package Ex04;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("abc"),
                new User("khanhan"),
                new User("an")
        );

        users.stream()
                .filter(user -> user.getUsername().length() >= 3)
                .map(User::getUsername)
                .forEach(System.out::println);
    }
}
