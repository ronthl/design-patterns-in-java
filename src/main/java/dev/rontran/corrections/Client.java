package dev.rontran.corrections;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Demo without following LSP ***");
        RegisteredUserPayment robinPayment = new RegisteredUserPayment("Robin");
        RegisteredUserPayment luffyPayment = new RegisteredUserPayment("Luffy");
        GuestUserPayment guestPayment = new GuestUserPayment();

        PaymentHelper paymentHelper = new PaymentHelper();
        paymentHelper.addPreviousPayment(robinPayment);
        paymentHelper.addPreviousPayment(luffyPayment);

        paymentHelper.addNewPayment(robinPayment);
        paymentHelper.addNewPayment(luffyPayment);
        paymentHelper.addNewPayment(guestPayment);

        paymentHelper.showPreviousPayments();
        System.out.println("*******");
        paymentHelper.processNewPayments();
    }
}
