package singleton_Design_Pattern;
import javax.xml.crypto.Data;

public class App {
    public static void main(String[] args) {
    /*
        DatabaseConnectionV1 dbc1 = new DatabaseConnectionV1();
        DatabaseConnectionV1 dbc2 = new DatabaseConnectionV1();
        System.out.println("Hello");
     */

    /*
        DatabaseConnectionV2 dbc3 = new DatabaseConnectionV2();
        DatabaseConnectionV2 dbc4 = new DatabaseConnectionV2();
        //because of private constructor we cant access
     */

      /*
        DatabaseConnectionV3 dbc5 = DatabaseConnectionV3.getInstance();
        DatabaseConnectionV3 dbc6 = DatabaseConnectionV3.getInstance();
        DatabaseConnectionV3.getInstance(); //not possible if the method is not static

        DatabaseConnectionV3 dbc5 = DatabaseConnectionV3.getInstance();
        DatabaseConnectionV3 dbc6 = DatabaseConnectionV3.getInstance();
        DatabaseConnectionV3.getInstance(); //possible if the method is static
       */

        /*
        //Here address will be the same for both dbc7 & dbc8
        //working on non-threaded singleton
        //Fails for multithreaded apps
        DatabaseConnectionV4 dbc7 = DatabaseConnectionV4.getInstance();
        DatabaseConnectionV4 dbc8 = DatabaseConnectionV4.getInstance();
        System.out.println("Hello");
         */
/*
        DatabaseConnectionV5 dbc8 = DatabaseConnectionV5.getInstance();
        DatabaseConnectionV5 dbc9 = DatabaseConnectionV5.getInstance();
        System.out.println("Hello");

 */

        DatabaseConnectionV7 dbc10 = DatabaseConnectionV7.getInstance();
        DatabaseConnectionV7 dbc11 = DatabaseConnectionV7.getInstance();
        System.out.println("Hello");
    }
}
