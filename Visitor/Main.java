public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer = new Developer();
        Book book = new ProgramingBook();
        customer.buy(book);

        ProgramingBook programingBook = new ProgramingBook();
        customer.buy(programingBook);
    }
}
