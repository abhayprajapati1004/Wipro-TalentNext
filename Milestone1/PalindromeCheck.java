import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(int num) {
        int reversedNum = reverseNumber(num);
        return num == reversedNum;
    }

    public static int reverseNumber(int num) {
        int reversedNum = 0;
        int originalNum = num;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
}