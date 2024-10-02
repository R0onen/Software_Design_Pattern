import java.sql.Driver;

public class DriverManager {
    private static DriverManager instance;
    public static method getInstance(){
        if (instance  == null){
            instance = new DriverManager();
        }
        return instance;
    }

    public String findNearestDriver(String location) {
        System.out.println("Nearest driver found: " + "Driver1");
        return "Driver1";
    }
}