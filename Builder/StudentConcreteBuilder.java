public class StudentConcreteBuilder implements StudentBuilder {
    private String id;
    private String firstName;
    private String lastName;
    private String dayOfBirth;
    private String currentClass;
    private String phone; 

    public void setID (String id){
        this.id = id;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public void setDayOfBirth (String dayOfBirth){
        this.dayOfBirth = dayOfBirth;
    }

    public void setCurrentClass (String currentClass){
        this.currentClass = currentClass;
    }

    public void setPhone (String phone){
        this.phone = phone;
    }

    public String getID (){
        return(this.id);
    }

    public String getFirstName (){
        return (this.firstName);
    }

    public String getLastName (){
        return(lastName);
    }

    public String getDayOfBirth (){
        return(dayOfBirth);
    }

    public String getCurrentClass (){
        return(currentClass);
    }

    public String getPhone (){
        return (phone);
    }
}
