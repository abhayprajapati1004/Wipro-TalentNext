import java.util.ArrayList;

public class EmployeeDB {
    private ArrayList<Employee> list;

    public EmployeeDB() {
        this.list = new ArrayList<>();
    }

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        for (Employee emp : list) {
            if (emp.getEmpId() == empId) {
                return list.remove(emp);
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (Employee emp : list) {
            if (emp.getEmpId() == empId) {
                return "Pay Slip for Employee ID " + empId + ": " + emp.getSalary();
            }
        }
        return "Employee not found";
    }
}