public class Developer implements Customer{
    public void buy (Book book){
        System.out.println("Developer buy a book");
    }

    public void buy (ProgramingBook programingBook){
        System.out.println("Developer buy a programing book");
    }

    public void buy (BussinessBook bussinessBook){
        System.out.println("Developer buy a business book");
    }
}
