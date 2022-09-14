package dev.rontran.violations;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** A demo without SRP ***");

        Employee dennis = new Employee("Dennis", "Cual", 7.5D);
        showEmployeeDetail(dennis);

        System.out.println("\n*************\n");

        Employee brian = new Employee("Brian", "Watson", 4);
        showEmployeeDetail(brian);
    }

    private static void showEmployeeDetail(Employee employee) {
        employee.displayEmployeeDetail();
        System.out.println("The employee id: " + employee.generateEmployeeId(employee.getFirstName()));
        System.out.println("This employee is a " +
                           employee.checkSeniority(employee.getExperienceInYears()) +
                           " employee.");
    }
}
