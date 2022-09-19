package dev.rontran.violations;

import java.util.ArrayList;
import java.util.Collection;

public class PaymentHelper {

    private Collection<Payment> payments = new ArrayList<>();

    public void addUserPayment(Payment userPayment) {
        payments.add(userPayment);
    }

    public void showPreviousPayments() {
        for (Payment payment : payments) {
            // Violates LSP since a guest user calls this method will cause an exception.
            payment.previousPaymentInfo();
        }
    }

    public void processNewPayments() {
        for (Payment payment : payments) {
            payment.newPayment();
        }
    }
}
