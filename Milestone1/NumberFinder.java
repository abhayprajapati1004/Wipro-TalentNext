public class NumberFinder {
    public static void main(String[] args) {
        int[] array = {1, 4, 34, 56, 7};
        int target = 56;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("-1");
        }
    }
}