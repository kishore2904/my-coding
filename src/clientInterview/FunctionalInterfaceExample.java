package clientInterview;
@FunctionalInterface
interface FunctionalInterfaceExample {

    void display(String message);

    default void logNotification(String message) {
        System.out.println("Logging notification: " + message);
    }

    // Static method
    static boolean validateMessage(String message) {
        return message != null && !message.isBlank();
    }
}
