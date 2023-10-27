public class UserServiceProxy implements UserService{
    private String role;
    private UserService userService;

    public UserServiceProxy(String name, String role){
        this.role = role;
        userService = new UserServiceImpl(name);
    }

    public void load(){
        userService.load();
    }

    public void insert(){
        userService.insert();
    }
}
