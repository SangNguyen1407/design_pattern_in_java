public class main {
    public static void main(String[] args) throws Exception {
        Computer computer1 = new Computer("Windows11", "Intel", "No", "Other1");
        Computer computer2 = computer1.clone();
        computer2.setOther("Other2");

        System.out.println(computer1);
        System.out.println(computer2);
    }
}
