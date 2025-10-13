import java.util.Optional;

class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

class Employee {
     
}

public class OptionalExample3 {
    public static void main(String[] args) {
        Employee employee = null;  
        try {
            Employee result = Optional.ofNullable(employee).orElseThrow(() -> new InvalidEmployeeException("Employee is null"));
            System.out.println(result);
        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}