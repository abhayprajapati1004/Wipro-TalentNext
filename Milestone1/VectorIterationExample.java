import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorIterationExample {
    public static void main(String[] args) {
        Vector<Employee> employees = new Vector<>();
        employees.add(new Employee("John Doe", 30));
        employees.add(new Employee("Jane Doe", 25));


        Iterator<Employee> iterator = employees.iterator();
        System.out.println("Using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        
        Enumeration<Employee> enumeration = employees.elements();
        System.out.println("Using Enumeration:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}