public class main {
    public static void main(String[] args) throws Exception {
        StudentBuilder studentBuilder = new StudentConcreteBuilder();
        studentBuilder.setFirstName("Nguyen");
        studentBuilder.setLastName("Hoang Sang");

        System.out.println(studentBuilder.getFirstName() + " " + studentBuilder.getLastName());

    }
}
