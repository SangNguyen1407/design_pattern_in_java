public class ShopFacede {
    private static final ShopFacede INSTANCE = new ShopFacede();

    private AccountService accountService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    private ShopFacede(){
        accountService = new AccountService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
    }

    public static ShopFacede getInstance(){
        return INSTANCE;
    }

    public void buyProductByCashWithFreeShipping(String email){
        accountService.getAccount(email);
        paymentService.paymentByCash();
        shippingService.freeShipping();
        System.out.println("Done\n");
    }

    public void buyProductByCashWithExpressShipping(String email){
        accountService.getAccount(email);
        paymentService.paymentByCash();
        shippingService.expressShipping();
        System.out.println("Done\n");
    }
}
