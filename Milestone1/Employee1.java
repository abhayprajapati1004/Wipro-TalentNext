import java.io.*;

class Employee implements Serializable {
    private String name;
    private String department;
    private String designation;
    private double salary;

    public Employee(String name, String department, String designation, double salary) {
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", department=" + department + ", designation=" + designation + ", salary="
                + salary + "]";
    }
}

public class Employee1 {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "HR", "Manager", 50000.0);

        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(emp);
            System.out.println("Employee object serialized and saved to employee.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("Deserialized Employee object:");
            System.out.println(deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}