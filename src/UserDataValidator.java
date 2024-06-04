public class UserDataValidator {
    private static void validateLogin(String login) {
        if (login.length() > 20 || !login.matches("\\w+")) {
            throw new CustomExceptions.WrongLoginException("Invalid login format");
        }
    }

    private static void validatePassword(String password, String confirmPassword) {
        if (password.length() > 20 || !password.matches("\\w+")) {
            throw new CustomExceptions.WrongPasswordException("Invalid password format");
        }

        if (!password.equals(confirmPassword)) {
            throw new CustomExceptions.WrongPasswordException("Password and confirm password do not match");
        }
    }

    public static void validateUserData(String login, String password, String confirmPassword) {
        validateLogin(login);
        validatePassword(password, confirmPassword);
    }
}