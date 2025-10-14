public class Project1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an employee ID as a command line argument.");
            System.out.println("Usage: java Project1 <empId>");
            return;
        }
        
        int empId;
        try {
            empId = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid employee ID. Please enter a numeric value.");
            return;
        }
        
        int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
        char[] designationCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
        
        int index = -1;
        for (int i = 0; i < empNo.length; i++) {
            if (empNo[i] == empId) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("There is no employee with empid : " + empId);
            return;
        }
        
        String designation = "";
        int da = 0;
        
        switch (designationCode[index]) {
            case 'e':
                designation = "Engineer";
                da = 20000;
                break;
            case 'c':
                designation = "Consultant";
                da = 32000;
                break;
            case 'k':
                designation = "Clerk";
                da = 12000;
                break;
            case 'r':
                designation = "Receptionist";
                da = 15000;
                break;
            case 'm':
                designation = "Manager";
                da = 40000;
                break;
            default:
                designation = "Unknown";
                da = 0;
        }
        
        int salary = basic[index] + hra[index] + da - it[index];
        
        System.out.println("Emp No. Emp Name  Department  Designation  Salary");
        System.out.println(empNo[index] + "    " + empName[index] + "      " + 
                          department[index] + "        " + designation + "      " + salary);
    }
}