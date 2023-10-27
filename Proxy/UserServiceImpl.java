public class UserServiceImpl implements UserService {
    private String name;

    public UserServiceImpl (String name){
        this.name = name;
    }

    public void load(){
        System.out.println(name + " loaded ");
    }
    
    public void insert(){
        System.out.println(name + " inserted ");
    }
}
