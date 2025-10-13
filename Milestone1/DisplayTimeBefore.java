import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DisplayTimeBefore {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime before5Hours30Minutes = now.minusHours(5).minusMinutes(30);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        System.out.println("Current Time: " + now.format(formatter));
        System.out.println("Time before 5 hours and 30 minutes: " + before5Hours30Minutes.format(formatter));
    }
}