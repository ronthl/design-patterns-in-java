package dev.rontran.violations;

import java.util.Set;

public class DistinctionDecider {

    private Set<String> science = Set.of("Computer Science", "Physics");
    private Set<String> arts = Set.of("History", "English");

    /**
     * Violates the Open-Closed Principle because the criteria to evaluate the distinction can be changed.
     * And everytime it changes, we need to update this method and re-test it.
     * Obviously, it's not closed for modification.
     */
    public void evaluateDistinction(Student student) {
        if (science.contains(student.getDepartment())) {
            if (student.getScore() > 80) {
                System.out.println(student.getRegistrationNumber() + " has received a distinction in science.");
            }
        }
        if (arts.contains(student.getDepartment())) {
            if (student.getScore() > 70) {
                System.out.println(student.getRegistrationNumber() + " has received a distinction in arts.");
            }
        }
    }
}
