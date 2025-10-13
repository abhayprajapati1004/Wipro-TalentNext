import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ReverseWordsConsumer {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
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

        Consumer<String> reverseWord = word -> {
            StringBuilder reversed = new StringBuilder(word).reverse();
            System.out.println(reversed);
        };

        words.forEach(reverseWord);

        
        for (int i = 0; i < words.size(); i++) {
            words.set(i, new StringBuilder(words.get(i)).reverse().toString());
        }

        System.out.println("Reversed Words: " + words);
    }
}