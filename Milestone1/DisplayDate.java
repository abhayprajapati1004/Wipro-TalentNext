import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DisplayDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate afterTenDays = today.plusDays(10);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        System.out.println("Today's Date: " + today.format(formatter));
        System.out.println("Date after ten days: " + afterTenDays.format(formatter));
    }
}