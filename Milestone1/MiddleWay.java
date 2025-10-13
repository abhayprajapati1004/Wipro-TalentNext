public class MiddleWay {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] result = middleWay(a, b);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] result = new int[2];
        result[0] = a[1];
        result[1] = b[1];
        return result;
    }
}