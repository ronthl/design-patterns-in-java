package dev.rontran.corrections;

import dev.rontran.corrections.deciders.ArtsDistinctionDecider;
import dev.rontran.corrections.deciders.DistinctionDecider;
import dev.rontran.corrections.deciders.ScienceDistinctionDecider;
import dev.rontran.corrections.models.ArtsStudent;
import dev.rontran.corrections.models.ScienceStudent;
import dev.rontran.corrections.models.Student;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** A demo without Open-Closed Principle ***");
        List<Student> enrolledScienceStudents = enrollScienceStudents();
        List<Student> enrolledArtsStudents = enrollArtsStudents();

        List<Student> enrolledStudents = new ArrayList<>(enrolledScienceStudents.size() + enrolledArtsStudents.size());
        enrolledStudents.addAll(enrolledScienceStudents);
        enrolledStudents.addAll(enrolledArtsStudents);

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
        DistinctionDecider scienceDistinctionDecider = new ScienceDistinctionDecider();
        for (Student student : enrolledScienceStudents) {
            scienceDistinctionDecider.evaluateDistinction(student);
        }

        DistinctionDecider artsDistinctionDecider = new ArtsDistinctionDecider();
        for (Student student : enrolledArtsStudents) {
            artsDistinctionDecider.evaluateDistinction(student);
        }
    }

    private static List<Student> enrollScienceStudents() {
        Student sam = new ScienceStudent("Sam", "R1", "Computer Science", 81.5);
        Student bob = new ScienceStudent("Bob", "R2", "Physics", 72);
        return List.of(sam, bob);
    }

    private static List<Student> enrollArtsStudents() {
        Student john = new ArtsStudent("John", "R3", "History", 71);
        Student kate = new ArtsStudent("Kate", "R4", "English", 66.5);
        return List.of(john, kate);
    }
}
