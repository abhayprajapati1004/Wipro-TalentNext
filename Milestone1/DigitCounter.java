@FunctionalInterface
interface DigitCount {
    int count(int n);
}

public class DigitCounter {
    public static int digitCount(int n) {
        return String.valueOf(Math.abs(n)).length();
    }

    public static void main(String[] args) {
        DigitCount counter = DigitCounter::digitCount;
        System.out.println("Number of digits in 12345: " + counter.count(12345));
    }
}