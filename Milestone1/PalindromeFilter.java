import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromeFilter {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("madam");
        words.add("hello");
        words.add("dad");
        words.add("java");
        words.add("level");
        words.add("radar");
        words.add("python");
        words.add("refer");
        words.add("civic");
        words.add("world");

        Predicate<String> isPalindrome = word -> word.equals(new StringBuilder(word).reverse().toString());
        words.stream().filter(isPalindrome).forEach(System.out::println);
    }
}