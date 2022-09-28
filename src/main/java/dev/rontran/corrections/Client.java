package dev.rontran.corrections;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Demo with DIP ***");
        Database oracleDatabase = new OracleDatabase();
        UserInterface userInterface = new UserInterface(oracleDatabase);
        userInterface.saveEmployeeId("E001");

        userInterface.setDatabase(new MySQLDatabase());
        userInterface.saveEmployeeId("E002");
    }
}
