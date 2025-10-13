public class MaxMinFinder {
    public static void main(String[] args) {
        int[] array = {10, 50, 30, 20, 40};
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}