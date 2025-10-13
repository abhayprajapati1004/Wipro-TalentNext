import java.time.Year;

public class LeapYearChecker {
    public static void main(String[] args) {
        Year currentYear = Year.now();
        
        if (currentYear.isLeap()) {
            System.out.println(currentYear + " is a leap year.");
        } else {
            System.out.println(currentYear + " is not a leap year.");
        }
    }
}