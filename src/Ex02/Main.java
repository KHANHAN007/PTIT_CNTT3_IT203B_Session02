package Ex02;

public class Main {
    static void main() {
//        PasswordValidator validator = new PasswordValidator() {
//            @Override
//            public boolean isValid(String password) {
//                return password.length() >= 8;
//            }
//        };
        PasswordValidator validator = (password) -> password.length() >= 8;
        System.out.println(validator.isValid("12345678")); // true
        System.out.println(validator.isValid("1234"));     // false
    }
}
