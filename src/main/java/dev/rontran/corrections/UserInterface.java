package dev.rontran.corrections;

public class UserInterface {

    private Database database;

    public UserInterface(Database database) {
        this.database = database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public void saveEmployeeId(String employeeId) {
        database.saveEmployeeIdInDatabase(employeeId);
    }
}
