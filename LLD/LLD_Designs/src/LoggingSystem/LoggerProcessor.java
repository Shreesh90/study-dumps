package LoggingSystem;

public abstract class LoggerProcessor {

    public static int INFO = 0;
    public static int DEBUG = 1;
    public static int ERROR = 2;

    public LoggerProcessor nextLoggerProcessor;

    public LoggerProcessor(LoggerProcessor nextLoggerProcessor) {
        this.nextLoggerProcessor = nextLoggerProcessor;
    }

    public void log(int logLevel, String log) {
        if(nextLoggerProcessor != null) {
            nextLoggerProcessor.log(logLevel, log);
        } else {
            System.out.println("Exception: " + log);
        }
    };
}
