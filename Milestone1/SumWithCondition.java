public class SumWithCondition {
    public static void main(String[] args) {
        int[] array = {10, 3, 6, 1, 2, 7, 9};
        boolean ignore = false;
        int sum = 0;
        for (int num : array) {
            if (num == 6) {
                ignore = true;
            } else if (num == 7 && ignore) {
                ignore = false;
                continue;
            }
            if (!ignore) {
                sum += num;
            }
        }
        System.out.println("Sum: " + sum);
    }
}