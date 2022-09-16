package dev.rontran.corrections.models;

public class ArtsStudent extends Student {

    public ArtsStudent(String name, String registrationNumber, String department, double score) {
        super(name, registrationNumber, score);
        this.department = department;
    }
}
