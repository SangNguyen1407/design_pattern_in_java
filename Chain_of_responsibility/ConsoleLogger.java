public class ConsoleLogger extends Logger {
    public ConsoleLogger(LogLevel logLevel){
        super(logLevel);
    }

    protected void writeMessage(String msg){
        System.out.println("Console logger: " + msg);
    }
}
