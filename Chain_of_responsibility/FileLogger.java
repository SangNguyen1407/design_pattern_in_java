public class FileLogger extends Logger {
    public FileLogger(LogLevel logLevel){
        super(logLevel);
    }

    protected void writeMessage(String msg){
        System.out.println("Console logger: " + msg);
    }    
}
