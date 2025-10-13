import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PerfectSquarePredicate {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(4);
        numbers.add(9);
        numbers.add(16);
        numbers.add(25);
        numbers.add(36);
        numbers.add(49);
        numbers.add(64);
        numbers.add(81);

        List<Integer> perfectSquares = numbers.stream()
                .filter(n -> Math.sqrt(n) % 1 == 0)
                .collect(Collectors.toList());

        System.out.println("Perfect Squares: " + perfectSquares);
    }
}