package dev.rontran.corrections.models;

public abstract class Student {

    private String name;
    private String registrationNumber;
    private double score;
    protected String department;

    public Student(String name, String registrationNumber, double score) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.score = score;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getScore() {
        return score;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nRegistration Number: " + registrationNumber +
                "\nDepartment: " + department +
                "\nScore: " + score;
    }
}
