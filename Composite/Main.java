import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Task task1 = new Task("Task1", 50);
        Task task2 = new Task("Task2", 60);
        Task task3 = new Task("Task3", 70);
        Task task4 = new Task("Task4", 80);
        
        ArrayList<TaskItem> subTasks = new ArrayList<>();
        subTasks.add(task1);
        subTasks.add(task2);
        Project project1 = new Project("Project 1", subTasks);

        subTasks = new ArrayList<>();
        subTasks.add(task3);
        subTasks.add(task4);
        Project project2 = new Project("Project 2", subTasks);


        ArrayList<TaskItem> projects = new ArrayList<>();
        projects.add(project1);
        projects.add(project2);

        Project mainProject = new Project("Project 2", projects);

        System.out.println("Total time for Main Project: " + mainProject.getTime());
    }
}
