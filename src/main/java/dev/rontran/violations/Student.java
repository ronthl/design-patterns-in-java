package dev.rontran.violations;

public class Student {
    private String name;
    private String registrationNumber;
    private String department;
    private double score;

    public Student(String name, String registrationNumber, String department, double score) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.department = department;
        this.score = score;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getDepartment() {
        return department;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Name: " + name +
               "\nRegistration Number: " + registrationNumber +
               "\nDepartment: " + department +
               "\nScore: " + score;
    }
}
