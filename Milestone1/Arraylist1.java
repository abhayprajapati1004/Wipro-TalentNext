import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>();
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        for (String month : monthNames) {
            months.add(month);
        }
        
        System.out.println("Months of the year: " + months);
    }
}