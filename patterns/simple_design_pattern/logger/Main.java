package simple_design_pattern.logger;

public class Main {
    public static void main(String[] args) {
        ILogger debugLogger = LoggerFactory.createLogger(LogLevel.DEBUG);
        ILogger infoLogger = LoggerFactory.createLogger(LogLevel.INFO);
        ILogger errorLogger = LoggerFactory.createLogger(LogLevel.ERROR);

        debugLogger.log("Hello I am debug logger");
        infoLogger.log("Hello I am info logger");
        errorLogger.log("Hello I am error logger");
    }
}