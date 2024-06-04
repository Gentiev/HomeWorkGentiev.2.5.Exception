public class Main {
    public static void main(String[] args) {
        try {
            UserDataValidator.validateUserData("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (CustomExceptions.WrongLoginException | CustomExceptions.WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}