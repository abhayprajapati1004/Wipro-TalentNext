public class TestEmployee {
    static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class Employee extends Person {
        private double annualSalary;
        private int yearStartedToWork;
        private String nationalInsuranceNumber;

        public Employee(String name, double annualSalary, int yearStartedToWork, String nationalInsuranceNumber) {
            super(name);
            this.annualSalary = annualSalary;
            this.yearStartedToWork = yearStartedToWork;
            this.nationalInsuranceNumber = nationalInsuranceNumber;
        }

        public double getAnnualSalary() {
            return annualSalary;
        }

        public void setAnnualSalary(double annualSalary) {
            this.annualSalary = annualSalary;
        }

        public int getYearStartedToWork() {
            return yearStartedToWork;
        }

        public void setYearStartedToWork(int yearStartedToWork) {
            this.yearStartedToWork = yearStartedToWork;
        }

        public String getNationalInsuranceNumber() {
            return nationalInsuranceNumber;
        }

        public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
            this.nationalInsuranceNumber = nationalInsuranceNumber;
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000.0, 2010, "AB123456C");
        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started to Work: " + employee.getYearStartedToWork());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());
    }
}