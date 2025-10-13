import java.util.LinkedList;

class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("John Doe", 30));
        employees.add(new Employee("Jane Doe", 25));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}