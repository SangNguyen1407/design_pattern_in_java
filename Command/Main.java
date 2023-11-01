public class Main {
    public static void main(String[] args) throws Exception {
        Account account = new Account("nhsang");

        Command open = new OpenAccount(account);
        Command close = new OpenAccount(account);
        BankApp bankApp = new BankApp(open, close);


        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();
    }
}
