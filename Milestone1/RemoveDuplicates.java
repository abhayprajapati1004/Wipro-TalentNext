import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {12, 34, 12, 45, 67, 89};
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num);
        }
        System.out.println(set);
    }
}