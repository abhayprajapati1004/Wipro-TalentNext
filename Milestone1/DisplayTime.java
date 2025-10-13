import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DisplayTime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime after25Minutes = now.plusMinutes(25);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        System.out.println("Current Time: " + now.format(formatter));
        System.out.println("Time after 25 minutes: " + after25Minutes.format(formatter));
    }
}