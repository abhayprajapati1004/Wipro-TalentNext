import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerAssignment1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        StringJoiner sj = new StringJoiner(", ", "{", "}");
        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj.toString());
    }
}