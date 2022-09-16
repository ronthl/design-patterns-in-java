package dev.rontran.violations;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** A demo without Open-Closed Principle ***");
        List<Student> enrolledStudents = enrollStudents();

        // Display all student profile.
        System.out.println("=== Student Profiles ===");
        boolean isFirstStudent = true;
        for (Student student : enrolledStudents) {
            if (!isFirstStudent) {
                System.out.println("*******");
            }
            System.out.println(student);
            isFirstStudent = false;
        }

        System.out.println("\n=== Distinctions ===");
        DistinctionDecider distinctionDecider = new DistinctionDecider();
        for (Student student : enrolledStudents) {
            distinctionDecider.evaluateDistinction(student);
        }
    }

    private static List<Student> enrollStudents() {
        Student sam = new Student("Sam", "R1", "Computer Science", 81.5);
        Student bob = new Student("Bob", "R2", "Physics", 72);
        Student john = new Student("John", "R3", "History", 71);
        Student kate = new Student("Kate", "R4", "English", 66.5);
        return List.of(sam, bob, john, kate);
    }
}
