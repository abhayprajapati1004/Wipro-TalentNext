package Jdbc;

public class JDBCCalls {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java JDBCCalls <option> [arguments...]");
            return;
        }

        DAOClass dao = new DAOClass();
        int option = Integer.parseInt(args[0]);

        try {
            switch (option) {
                case 1:
                    if (args.length != 6) {
                        System.out.println("Usage: java JDBCCalls 1 <rollno> <name> <standard> <dob> <fees>");
                        return;
                    }
                    int rollnoIns = Integer.parseInt(args[1]);
                    String name = args[2];
                    String std = args[3];
                    String dob = args[4];
                    double fees = Double.parseDouble(args[5]);
                    dao.insert(rollnoIns, name, std, dob, fees);
                    break;

                case 2:
                    if (args.length != 2) {
                        System.out.println("Usage: java JDBCCalls 2 <rollno>");
                        return;
                    }
                    int rollnoDel = Integer.parseInt(args[1]);
                    dao.delete(rollnoDel);
                    break;

                case 3:
                     if (args.length != 3) {
                        System.out.println("Usage: java JDBCCalls 3 <rollno> <new_fees>");
                        return;
                    }
                    int rollnoMod = Integer.parseInt(args[1]);
                    double newFees = Double.parseDouble(args[2]);
                    dao.modify(rollnoMod, newFees);
                    break;

                case 4:
                    if (args.length == 1) {
                        dao.display();
                    } else if (args.length == 2) {
                        int rollnoDisp = Integer.parseInt(args[1]);
                        dao.display(rollnoDisp);
                    } else {
                        System.out.println("Usage: java JDBCCalls 4 [rollno]");
                    }
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1, 2, 3, or 4.");
                    break;
            }
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid number format for one of the arguments.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}