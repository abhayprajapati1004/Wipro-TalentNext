import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        scanner.close();

        if (Character.isLowerCase(inputChar)) {
            System.out.println("Converted character: " + Character.toUpperCase(inputChar));
        } else if (Character.isUpperCase(inputChar)) {
            System.out.println("Converted character: " + Character.toLowerCase(inputChar));
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }
    }
}