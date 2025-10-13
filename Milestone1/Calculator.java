public class Calculator {
    // Static method to calculate the power of two integers
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Static method to calculate the power of a double and an integer
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        // Test the functionalities
        System.out.println("2 to the power 3 (int): " + Calculator.powerInt(2, 3));
        System.out.println("2.5 to the power 3 (double): " + Calculator.powerDouble(2.5, 3));
    }
}