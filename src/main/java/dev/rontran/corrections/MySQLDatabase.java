package dev.rontran.corrections;

public class MySQLDatabase implements Database {
    @Override
    public void saveEmployeeIdInDatabase(String employeeId) {
        System.out.println("The id: " + employeeId + " is saved in the MySQL database.");
    }
}
