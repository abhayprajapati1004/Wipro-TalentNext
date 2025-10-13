@FunctionalInterface
interface Factorial {
    int calculate(int n);
}

public class FactorialCalculator {
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input should be a non-negative integer.");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        Factorial factorial = calculator::factorial;
        System.out.println("Factorial of 5: " + factorial.calculate(5));
    }
}