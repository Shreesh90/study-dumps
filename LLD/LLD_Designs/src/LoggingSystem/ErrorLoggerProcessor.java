package LoggingSystem;

public class ErrorLoggerProcessor extends LoggerProcessor{
    public ErrorLoggerProcessor(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    @Override
    public void log(int logLevel, String log) {
        if(logLevel == ERROR) {
            System.out.println("ERROR: " + log);
        } else {
            super.log(logLevel, log);
        }
    }
}
