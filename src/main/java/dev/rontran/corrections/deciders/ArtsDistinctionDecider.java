package dev.rontran.corrections.deciders;

import dev.rontran.corrections.models.Student;

public class ArtsDistinctionDecider implements DistinctionDecider {

    @Override
    public void evaluateDistinction(Student student) {
        if (student.getScore() > 70) {
            System.out.println(student.getRegistrationNumber() + " has received a distinction in science.");
        }
    }
}
