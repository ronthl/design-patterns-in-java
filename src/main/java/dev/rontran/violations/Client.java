package dev.rontran.violations;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Demo without DIP ***");
        OracleDatabase oracleDatabase = new OracleDatabase();
        UserInterface userInterface = new UserInterface(oracleDatabase);
        userInterface.saveEmployeeId("E001");
        userInterface.saveEmployeeId("E002");
    }
}
