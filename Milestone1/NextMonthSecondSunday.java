import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class NextMonthSecondSunday {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextMonth = today.plusMonths(1).with(TemporalAdjusters.firstDayOfMonth());
        LocalDate nextSunday = nextMonth.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        LocalDate secondSunday = nextSunday.plusWeeks(1);
        
        System.out.println("Next month's second Sunday: " + secondSunday);
    }
}