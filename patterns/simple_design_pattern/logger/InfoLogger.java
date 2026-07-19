package simple_design_pattern.logger;

public class InfoLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("INFO : " + message);
    }
}