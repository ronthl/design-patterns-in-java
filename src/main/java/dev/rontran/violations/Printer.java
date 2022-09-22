package dev.rontran.violations;

public interface Printer {
    void printDocument();

    /**
     * Violates the Interface Segregation Principle because the Basic Printer does not have sending fax function.
     */
    void sendFax();
}
