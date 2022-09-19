package dev.rontran.corrections;

public class GuestUserPayment implements NewPayment {

    private String name = "guest";

    @Override
    public void newPayment() {
        System.out.println("Processing " + name + "'s current payment request.");
    }
}
