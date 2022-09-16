package dev.rontran.corrections.models;

public class ScienceStudent extends Student {

    public ScienceStudent(String name, String registrationNumber, String department, double score) {
        super(name, registrationNumber, score);
        this.department = department;
    }
}
