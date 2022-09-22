package dev.rontran.violations;

public class BasicPrinter implements Printer {
    @Override
    public void printDocument() {
        System.out.println("The basic printer prints a document.");
    }

    @Override
    public void sendFax() {
        throw new UnsupportedOperationException("The basic printer doesn't support to send a fax.");
    }
}
