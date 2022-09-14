package dev.rontran.corrections;

public class SeniorityChecker {

    public String checkSeniority(double experienceInYears) {
        return experienceInYears > 5 ? "senior" : "junior";
    }
}
