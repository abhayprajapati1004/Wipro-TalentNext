import java.util.ArrayList;
import java.util.function.Function;

class Employee {
    int id;
    String name;
    String location;
    double salary;

    public Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }
}

public class LocationExtractor {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "New York", 50000));
        employees.add(new Employee(2, "Alice", "London", 60000));
        employees.add(new Employee(3, "Bob", "Paris", 70000));
        employees.add(new Employee(4, "Charlie", "Tokyo", 80000));
        employees.add(new Employee(5, "David", "Sydney", 90000));

        Function<Employee, String> locationExtractor = Employee::getLocation;
        ArrayList<String> locations = new ArrayList<>();
        for (Employee employee : employees) {
            locations.add(locationExtractor.apply(employee));
        }

        System.out.println(locations);
    }
}