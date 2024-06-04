public class CustomExceptions {
    public static class WrongLoginException extends RuntimeException {
        public WrongLoginException(String message) {
            super(message);
        }
    }

    public static class WrongPasswordException extends RuntimeException {
        public WrongPasswordException(String message) {
            super(message);
        }
    }
}