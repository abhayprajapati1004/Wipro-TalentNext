public class LastDigitCheck {
    public static void main(String[] args) {
        System.out.println(lastDigit(7, 17));  // true
        System.out.println(lastDigit(6, 17));  // false
        System.out.println(lastDigit(3, 113)); // true
    }

    public static boolean lastDigit(int a, int b) {
        return Math.abs(a) % 10 == Math.abs(b) % 10;
    }
}