public class RemoveTens {
    public static void main(String[] args) {
        int[] array = {1, 10, 10, 2};
        int writeIndex = 0;
        for (int readIndex = 0; readIndex < array.length; readIndex++) {
            if (array[readIndex] != 10) {
                array[writeIndex++] = array[readIndex];
            }
        }
        while (writeIndex < array.length) {
            array[writeIndex++] = 0;
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}