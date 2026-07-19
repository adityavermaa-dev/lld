package simple_design_pattern.logger;

public class ErrorLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("ERROR : " + message);
    }
}