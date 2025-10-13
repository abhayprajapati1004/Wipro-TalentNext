import java.util.ArrayList;
import java.util.function.Consumer;

public class NumberParityConsumer {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        Consumer<Integer> displayParity = num -> System.out.println(num + " " + (num % 2 == 0 ? "even" : "odd"));

        numbers.forEach(displayParity);
    }
}