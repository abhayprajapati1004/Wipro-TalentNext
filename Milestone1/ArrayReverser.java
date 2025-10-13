public class ArrayReverser {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }

        int[][] arr = new int[2][2];
        int index = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(args[index++]);
            }
        }

        
        int temp = arr[0][0];
        arr[0][0] = arr[1][1];
        arr[1][1] = temp;
        temp = arr[0][1];
        arr[0][1] = arr[1][0];
        arr[1][0] = temp;


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}