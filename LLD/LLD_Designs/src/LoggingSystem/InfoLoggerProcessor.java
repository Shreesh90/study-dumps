package LoggingSystem;

public class InfoLoggerProcessor extends LoggerProcessor {

    public InfoLoggerProcessor(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    @Override
    public void log(int logLevel, String log) {
        if(logLevel == INFO) {
            System.out.println("INFO: " + log);
        } else {
            super.log(logLevel, log);
        }
    }
}
