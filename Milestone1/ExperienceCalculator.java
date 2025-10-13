import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ExperienceCalculator {
    public static void main(String[] args) {
        LocalDate joiningDate = LocalDate.of(2020, 1, 1); // Replace with actual joining date
        LocalDate today = LocalDate.now();
        
        long years = ChronoUnit.YEARS.between(joiningDate, today);
        long months = ChronoUnit.MONTHS.between(joiningDate, today) % 12;
        long days = ChronoUnit.DAYS.between(joiningDate.plusYears(years).plusMonths(months), today);
        
        System.out.println("Experience: " + years + " years, " + months + " months, " + days + " days");
    }
}