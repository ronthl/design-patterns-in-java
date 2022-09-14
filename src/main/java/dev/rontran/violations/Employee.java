package dev.rontran.violations;

import java.util.Random;

public class Employee {
    private String firstName;
    private String lastName;
    private double experienceInYears;

    public Employee(String firstName, String lastName, double experienceInYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceInYears = experienceInYears;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getExperienceInYears() {
        return experienceInYears;
    }

    public void displayEmployeeDetail() {
        System.out.println("The employee name: " + lastName + ", " + firstName);
        System.out.println("This employee has " + experienceInYears + " years of experience.");
    }

    /**
     * Violates the principle since the requirement can be changed to use a different criterion to decide
     * a seniority level.
     */
    public String checkSeniority(double experienceInYears) {
        return experienceInYears > 5 ? "senior" : "junior";
    }

    /**
     * This method will concatenate the first letter of the given {@code employeeFirstName} with a random
     * number to form an employee ID.
     * <p>
     * Violates the principle since the requirement can be changed to use a complex algorithm to
     * generate the employee id.
     * </p>
     */
    public String generateEmployeeId(String employeeFirstName) {
        int random = new Random().nextInt(1000);
        return employeeFirstName.substring(0, 1) + random;
    }
}
