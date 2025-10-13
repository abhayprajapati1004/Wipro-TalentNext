import java.util.HashSet;
import java.util.Iterator;

public class Employee2 {
    public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();
        employees.add("John");
        employees.add("Alice");
        employees.add("Bob");

        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}