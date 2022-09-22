package dev.rontran.corrections;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** A demo without ISP ***");
        Printer printer = new BasicPrinter();
        printer.printDocument();

        printer = new AdvancedPrinter();
        printer.printDocument();

        FaxDevice faxDevice = new AdvancedPrinter();
        faxDevice.sendFax();
    }
}
