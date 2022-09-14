package dev.rontran.corrections;

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
}
