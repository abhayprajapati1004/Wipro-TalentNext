public class OneFourChecker {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4};
        System.out.println(only14(arr));
    }

    public static boolean only14(int[] arr) {
        for (int num : arr) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }
}