public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("NORMAL EMPLOYEE: ");
        EmployeeComponent employee = new EmployeeConcreteComponent ("Test");
        employee.showBasicInformation();
        employee.doTask();
    }
}
