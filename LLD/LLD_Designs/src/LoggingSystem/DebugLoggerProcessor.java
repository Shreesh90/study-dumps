package LoggingSystem;

public class DebugLoggerProcessor extends LoggerProcessor{
    public DebugLoggerProcessor(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    @Override
    public void log(int logLevel, String log) {
        if(logLevel == DEBUG) {
            System.out.println("DEBUG: " + log);
        } else {
            super.log(logLevel, log);
        }
    }
}
