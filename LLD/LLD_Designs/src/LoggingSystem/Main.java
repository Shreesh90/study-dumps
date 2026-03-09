package LoggingSystem;

public class Main {
    public static void main(String[] args) {
        LoggerProcessor Logger = new InfoLoggerProcessor(new DebugLoggerProcessor(new ErrorLoggerProcessor(null)));

        Logger.log(LoggerProcessor.ERROR, "exception happened");
        Logger.log(LoggerProcessor.DEBUG, "debugging happened");
        Logger.log(LoggerProcessor.INFO, "working as expected");
        Logger.log(4, "working as expected");

    }
}
