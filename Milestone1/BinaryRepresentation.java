import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 255: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number >= 1 && number <= 255) {
            String binary = String.format("%8s", Integer.toBinaryString(number)).replace(' ', '0');
            System.out.println(binary);
        } else {
            System.out.println("Number is out of range. Please enter a number between 1 and 255.");
        }
    }
}