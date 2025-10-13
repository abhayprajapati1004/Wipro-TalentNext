import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            numbers.add(random.nextInt(100));
        }
        
        List<Integer> primeNumbers = numbers.stream()
                .filter(n -> isPrime(n))
                .collect(Collectors.toList());
        
        System.out.println("Prime numbers: " + primeNumbers);
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}