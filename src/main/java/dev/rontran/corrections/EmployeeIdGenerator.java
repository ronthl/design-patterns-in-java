package dev.rontran.corrections;

import java.util.Random;

public class EmployeeIdGenerator {

    /**
     * This method will concatenate the first letter of the given {@code employeeFirstName} with a random
     * number to form an employee ID.
     */
    public String generateEmployeeId(String employeeFirstName) {
        int random = new Random().nextInt(1000);
        return employeeFirstName.substring(0, 1) + random;
    }
}
