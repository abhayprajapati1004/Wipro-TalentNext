import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your gender (Male/Female): ");
        String gender = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();

        double interestPercentage = 0.0;

        if (gender.equalsIgnoreCase("Male") && age >= 59 && age <= 100) {
            interestPercentage = 10.5;
        } else if (gender.equalsIgnoreCase("Male") && age >= 1 && age <= 58) {
            interestPercentage = 8.4;
        } else if (gender.equalsIgnoreCase("Female") && age >= 59 && age <= 100) {
            interestPercentage = 9.2;
        } else if (gender.equalsIgnoreCase("Female") && age >= 1 && age <= 58) {
            interestPercentage = 8.2;
        }

        System.out.println("Percentage of interest: " + interestPercentage + "%");
    }
}