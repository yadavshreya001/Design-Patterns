package singleton_Design_Pattern;

 /*
    --------------------------------------------------
                FINAL SOLUTION
    --------------------------------------------------
     */


public class DatabaseConnectionV7 {
    private static DatabaseConnectionV7 dbC = null;
    private String url;
    private String username;
    private String password;
    private int portNumber;

    //private constructor
    private DatabaseConnectionV7() {

    }
    //for thread safety, we used "Double-checked locking"
    public static DatabaseConnectionV7 getInstance(){
        if(dbC==null){
            /*
             synchronized (dbC) {                              */
            //This can lead to a Null pointer if dbc is not initialized.
            // This will allow only one thread to enter the synchronized block of code for DatabaseConnectionV7 class.
            // In java, every class has a Class object associated with it; hence this works.
            synchronized (DatabaseConnectionV7.class) {
                if(dbC==null){
                    dbC = new DatabaseConnectionV7();
                }
            }
        }
        return dbC;
    }
    //getter for url
    public String getUrl() {
        return url;
    }
    //setter for url
    public void setUrl(String url) {
        this.url = url;
    }

    //getter for username
    public String getUsername() {
        return username;
    }
    //setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    //getter for password
    public String getPassword() {
        return password;
    }
    //setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    //getter for portNumber
    public int getPortNumber() {
        return portNumber;
    }
    //setter for portNumber
    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }
}
