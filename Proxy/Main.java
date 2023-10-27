public class Main {
    public static void main(String[] args) throws Exception {
        UserService user1 = new UserServiceProxy("nhsang", "user");
        user1.load();
        user1.insert();


        UserService user2 = new UserServiceProxy("admin", "admin");
        user2.load();
        user2.insert();
    }
}
