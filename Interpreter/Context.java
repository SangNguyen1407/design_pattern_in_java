public class Context{
    private String input;
    private int output;

    public Context (String input){
        this.input = input;
    }

    public void setInput ( String input ){
        this.input = input;
    }
    
    public void setOutput ( int output ){
        this.output = output;
    }

    public String getInput(){
        return this.input;
    }

    public int getOutput(){
        return this.output;
    }
}