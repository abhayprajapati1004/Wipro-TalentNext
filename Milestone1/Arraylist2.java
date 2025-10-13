import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Arraylist2 {
    public static void main(String[] args) {
       
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-2);
        numbers.add(3);
        numbers.add(-4);
        numbers.add(5);
        numbers.add(-6);

        
        List<Integer> negativeEvens = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        
        System.out.println("Negative Even Numbers: " + negativeEvens);
    }
}