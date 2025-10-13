import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num > 0) {
            System.out.println(num + " is Positive.");
        } else if (num < 0) {
            System.out.println(num + " is Negative.");
        } else {
            System.out.println(num + " is Zero.");
        }
    }
}