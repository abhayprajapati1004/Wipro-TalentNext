import java.util.InputMismatchException;
import java.util.Scanner;


class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}


class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class StudentAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            try {
                System.out.println("Enter name of Student " + (i+1) + ":");
                String name = scanner.next();
                System.out.println("Enter marks in Subject 1, 2, and 3 for " + name + ":");
                int mark1 = scanner.nextInt();
                int mark2 = scanner.nextInt();
                int mark3 = scanner.nextInt();
                
                validateMark(mark1);
                validateMark(mark2);
                validateMark(mark3);
                
                double average = calculateAverage(mark1, mark2, mark3);
                System.out.println("Average marks for " + name + ": " + average);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integer values.");
                scanner.next();  
                i--;  
            } catch (NegativeValueException | OutOfRangeException e) {
                System.out.println(e.getMessage());
                i--; 
            }
        }
        scanner.close();
    }

    private static double calculateAverage(int mark1, int mark2, int mark3) {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    private static void validateMark(int mark) throws NegativeValueException, OutOfRangeException {
        if (mark < 0) {
            throw new NegativeValueException("Negative marks are not allowed.");
        }
        if (mark > 100) {
            throw new OutOfRangeException("Marks should be between 0 and 100.");
        }
    }
}