// Logger class for single object creation
// Singleton pattern applied here
class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger instance created.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

 class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger loggerAgain = Logger.getInstance();

        logger1.log("This is the first log message.");
        loggerAgain.log("This is the second log message.");

        if (logger1 == loggerAgain) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Logger instances are different.");
        }

    }
}