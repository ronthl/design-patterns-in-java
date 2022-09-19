package dev.rontran.corrections;


public class RegisteredUserPayment implements PreviousPayment, NewPayment {
    private String name;

    public RegisteredUserPayment(String username) {
        this.name = username;
    }

    @Override
    public void previousPaymentInfo() {
        System.out.println("Receiving " + name + "'s last payment details.");
    }

    @Override
    public void newPayment() {
        System.out.println("Processing " + name + "'s current payment request.");
    }
}
