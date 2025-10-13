import java.util.*;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("Maharashtra", "Mumbai");
        properties.put("Karnataka", "Bengaluru");

        Enumeration<?> enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements()) {
            String key = (String) enumeration.nextElement();
            System.out.println("State: " + key + ", Capital: " + properties.getProperty(key));
        }
    }
}