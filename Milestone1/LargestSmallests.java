import java.util.Arrays;

public class LargestSmallests {
    public static void main(String[] args) {
        int[] array = {10, 50, 30, 20, 40};
        Arrays.sort(array);
        System.out.println("Smallest 2: " + array[0] + ", " + array[1]);
        System.out.println("Largest 2: " + array[array.length - 1] + ", " + array[array.length - 2]);
    }
}