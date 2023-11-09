public class Main {
    public static void main(String[] args) throws Exception {
        PageTemplate homePage = new HomePage();
        homePage.showPage();
         
        System.out.println();
        PageTemplate detailPage = new DetailPage();
        detailPage.showPage();
 
        System.out.println();
    }
}
