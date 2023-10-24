public class Computer implements Cloneable{
    private String os;
    private String office;
    private String antivirus;
    private String other;

    public Computer(String os, String office, String antivirus, String other){
        super();
        this.os     = os;
        this.office = office;
        this.antivirus = antivirus;
        this.other  = other;
    }

    @Override
    protected Computer clone() throws CloneNotSupportedException {
        return (Computer) super.clone();
    }

    public String toString(){
        return "Computer[ os = " + os + ", office = " + office + ", antivirus = " + antivirus + ", other = " + other + " ]";
    }

    public void setOther(String other){
        this.other = other;
    }
}
