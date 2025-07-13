// Logger.java
public class Logger {
    // Step 1: Create a private static instance
    private static Logger instance;

    // Step 2: Make the constructor private so that this class cannot be instantiated from outside
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Step 3: Provide a public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization
        }
        return instance;
    }

    // Example method for logging
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}

