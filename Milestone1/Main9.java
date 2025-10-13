import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main9 {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(44);
        numbers.add(57);
        numbers.add(92);
        
        List<Integer> primeNumbers = numbers.stream()
                .filter(n -> isPrime(n))
                .collect(Collectors.toList());
        
        System.out.println("Prime numbers: " + primeNumbers);

        
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        words.add("elderberry");
        
        List<String> reversedWords = words.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        
        System.out.println("Reversed words: " + reversedWords);

        
        List<String> oddLengthWords = words.stream()
                .filter(word -> word.length() % 2 != 0)
                .collect(Collectors.toList());
        
        System.out.println("Words with odd length: " + oddLengthWords);

        WordCount wordCount = (str) -> str.split("\\s+").length;
        String testString = "This is a test string";
        int count = wordCount.count(testString);
        System.out.println("Number of words: " + count);
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

@FunctionalInterface
interface WordCount {
    int count(String str);
}