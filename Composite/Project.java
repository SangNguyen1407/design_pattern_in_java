import java.util.ArrayList;

public class Project extends TaskItem {
    String name;
    ArrayList<TaskItem> subTasks = new ArrayList<>();

    public Project(String name, ArrayList<TaskItem> subTask){
        this.name = name;
        this.subTasks = subTask;
    }

    public double getTime(){
        double time = 0;
        for (TaskItem task: subTasks){
            time += task.getTime();
        }
        return time;
    }

    public void addTask(TaskItem taskItem){
        subTasks.add(taskItem);
    }

    public void removeTask(TaskItem taskItem) {
        subTasks.remove(taskItem);
      }
}
