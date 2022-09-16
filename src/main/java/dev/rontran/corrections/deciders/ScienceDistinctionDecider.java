package dev.rontran.corrections.deciders;

import dev.rontran.corrections.models.Student;

public class ScienceDistinctionDecider implements DistinctionDecider {

    @Override
    public void evaluateDistinction(Student student) {
        if (student.getScore() > 80) {
            System.out.println(student.getRegistrationNumber() + " has receive a distinction in arts.");
        }
    }
}
