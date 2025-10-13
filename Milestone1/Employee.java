public class Employee {
    private int empId;
    private String empName;
    private String email;
    private String gender;
    private float salary;

    public Employee(String empName, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
    }

    public int getEmpId() {
        return empId;
    }

    public float getSalary() {
        return salary;
    }
}