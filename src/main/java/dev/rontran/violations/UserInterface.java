package dev.rontran.violations;

public class UserInterface {

    /**
     * Violates DIP since the high-level concrete class (UserInterface) depends on
     * the low-level concrete class (OracleDatabase).
     * And if we want to use different database, we can't use it without updating this class,
     * it also violates Open-Closed Principle.
     */
    private OracleDatabase oracleDatabase;

    public UserInterface(OracleDatabase oracleDatabase) {
        this.oracleDatabase = oracleDatabase;
    }

    public void saveEmployeeId(String employeeId) {
        oracleDatabase.saveEmployeeIdInDatabase(employeeId);
    }
}
