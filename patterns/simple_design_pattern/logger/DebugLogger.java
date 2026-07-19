package simple_design_pattern.logger;

public class DebugLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("DEBUG : " + message);
    }
}