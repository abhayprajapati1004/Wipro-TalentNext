import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main8 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        words.add("elderberry");
        words.add("fig");
        words.add("grape");
        words.add("honeydew");
        words.add("ice cream");
        words.add("jackfruit");
        
        List<String> oddLengthWords = words.stream()
                .filter(word -> word.length() % 2 != 0)
                .collect(Collectors.toList());
        
        System.out.println("Words with odd length: " + oddLengthWords);
    }
}