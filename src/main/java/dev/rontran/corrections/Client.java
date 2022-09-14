package dev.rontran.corrections;

public class Client {

    public static void main(String[] args) {
        Employee dennis = new Employee("Dennis", "Cual", 7.5D);
        showEmployeeDetail(dennis);

        System.out.println("\n*************\n");

        Employee brian = new Employee("Brian", "Watson", 4);
        showEmployeeDetail(brian);
    }

    private static void showEmployeeDetail(Employee employee) {
        employee.displayEmployeeDetail();

        EmployeeIdGenerator idGenerator = new EmployeeIdGenerator();
        System.out.println("The employee id: " + idGenerator.generateEmployeeId(employee.getFirstName()));

        SeniorityChecker seniorityChecker = new SeniorityChecker();
        System.out.println("This employee is a " +
                           seniorityChecker.checkSeniority(employee.getExperienceInYears()) +
                           " employee.");
    }
}
