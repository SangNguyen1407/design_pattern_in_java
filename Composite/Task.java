public class Task extends TaskItem {
    String name;
    double time;
    
    public Task(String name, double time){
        this.name = name;
        this.time = time;
    }

    public double getTime(){
        return time;
    }
}
