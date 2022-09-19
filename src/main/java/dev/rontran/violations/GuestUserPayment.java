package dev.rontran.violations;

public class GuestUserPayment implements Payment {

    private String name = "guest";

    @Override
    public void previousPaymentInfo() {
        throw new UnsupportedOperationException("Guest user is not supported to view the last payment!");
    }

    @Override
    public void newPayment() {
        System.out.println("Processing " + name + "'s current payment request.");
    }
}
