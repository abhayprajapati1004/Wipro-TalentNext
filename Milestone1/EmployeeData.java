import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeData {
    private int empNo;
    private String name;
    private int age;
    private String location;

    public EmployeeData(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }

    
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new EmployeeData(1, "John", 30, "Pune"));
        employees.add(new EmployeeData(2, "Alice", 25, "Mumbai"));
        employees.add(new EmployeeData(3, "Bob", 35, "Pune"));
        employees.add(new EmployeeData(4, "Charlie", 28, "Bangalore"));
        employees.add(new EmployeeData(5, "David", 32, "Pune"));

        List<Employee> puneEmployees = employees.stream()
                .filter(employee -> employee.getLocation().equals("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees in Pune: " + puneEmployees);
    }
}