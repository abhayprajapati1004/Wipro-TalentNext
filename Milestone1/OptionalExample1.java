import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
        String names[] = new String[5];
        Optional<String> optionalName = Optional.ofNullable(names[0]);
        optionalName.ifPresent(name -> System.out.println(name.length()));
    }
}