public class CloseAccount implements Command {
    private Account account;

    public CloseAccount(Account account){
        this.account = account;
    }

    public void execute(){
        account.close();
    }    
}
