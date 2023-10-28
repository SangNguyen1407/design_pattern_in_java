public class Main {
    public static void main(String[] args) throws Exception {
        ShopFacede.getInstance().buyProductByCashWithFreeShipping("test2012@gmail.com");
        ShopFacede.getInstance().buyProductByCashWithExpressShipping("test2008@gmail.com");
    }
}
