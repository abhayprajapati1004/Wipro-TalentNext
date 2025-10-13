public class EvenOddRearranger {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] result = evenOdd(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] evenOdd(int[] arr) {
        int[] result = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = arr.length - 1;
        for (int num : arr) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }
        return result;
    }
}