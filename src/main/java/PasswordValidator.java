public class PasswordValidator {

    public boolean isValid(String password) {
        return password.length() == 8 && password.matches(".*[a-z].*") && password.contains("!");
    }
}
