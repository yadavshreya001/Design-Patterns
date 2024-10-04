package singleton_Design_Pattern;

public class DatabaseConnectionV4 {
    private static DatabaseConnectionV4 dbC = null;
    private String url;
    private String username;
    private String password;
    private int portNumber;

    //private constructor
    private DatabaseConnectionV4() {

    }

    public static DatabaseConnectionV4 getInstance(){
        if(dbC == null){
            dbC = new DatabaseConnectionV4();
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
