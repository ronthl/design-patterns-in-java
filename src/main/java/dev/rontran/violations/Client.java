package dev.rontran.violations;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Demo without following LSP ***");
        RegisteredUserPayment robinPayment = new RegisteredUserPayment("Robin");
        RegisteredUserPayment luffyPayment = new RegisteredUserPayment("Luffy");
        GuestUserPayment guestPayment = new GuestUserPayment();

        PaymentHelper paymentHelper = new PaymentHelper();
        paymentHelper.addUserPayment(robinPayment);
        paymentHelper.addUserPayment(luffyPayment);
        paymentHelper.addUserPayment(guestPayment);

        paymentHelper.showPreviousPayments();
        System.out.println("*******");
        paymentHelper.processNewPayments();
    }
}
