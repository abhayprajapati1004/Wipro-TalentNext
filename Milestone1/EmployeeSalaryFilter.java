import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeSalaryFilter {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 5000));
        employees.add(new Employee(2, "Alice", 15000));
        employees.add(new Employee(3, "Bob", 8000));
        employees.add(new Employee(4, "Charlie", 12000));
        employees.add(new Employee(5, "David", 6000));

        Predicate<Employee> salaryFilter = employee -> employee.getSalary() < 10000;
        employees.stream().filter(salaryFilter).map(Employee::getName).forEach(System.out::println);
    }
}