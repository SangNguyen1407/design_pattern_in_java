public abstract class User{
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
    
    public int hashCode() {
        return name.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
 
        }
 
        if (this.getClass() != obj.getClass()) {
            return false;
        }
 
        User user = (User) obj;
        return name.equals(user.name);
    }
}