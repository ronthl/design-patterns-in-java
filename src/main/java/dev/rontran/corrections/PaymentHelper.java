package dev.rontran.corrections;

import java.util.ArrayList;
import java.util.Collection;

public class PaymentHelper {

    private Collection<PreviousPayment> previousPayments = new ArrayList<>();
    private Collection<NewPayment> newPayments = new ArrayList<>();

    public void addPreviousPayment(PreviousPayment previousPayment) {
        this.previousPayments.add(previousPayment);
    }

    public void addNewPayment(NewPayment newPayment) {
        this.newPayments.add(newPayment);
    }

    public void showPreviousPayments() {
        for (PreviousPayment payment : previousPayments) {
            payment.previousPaymentInfo();
        }
    }

    public void processNewPayments() {
        for (NewPayment payment : newPayments) {
            payment.newPayment();
        }
    }
}
