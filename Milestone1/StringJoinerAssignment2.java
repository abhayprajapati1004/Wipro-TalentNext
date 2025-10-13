import java.util.StringJoiner;

public class StringJoinerAssignment2 {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-");
        s1.add("New York");
        s1.add("Los Angeles");
        s1.add("Chicago");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("London");
        s2.add("Paris");
        s2.add("Berlin");


        s2.merge(s1);
        System.out.println("s1 merged to s2: " + s2.toString());


        s1 = new StringJoiner("-");
        s1.add("New York");
        s1.add("Los Angeles");
        s1.add("Chicago");

        s2 = new StringJoiner("-");
        s2.add("London");
        s2.add("Paris");
        s2.add("Berlin");


        s1.merge(s2);
        System.out.println("s2 merged to s1: " + s1.toString());
    }
}