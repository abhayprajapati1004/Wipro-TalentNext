public class FloydsTriangle {
    public static void main(String[] args) {
        int rows = 5; // Example number of rows
        int i = 1;
        int num= 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
                num++;
            }
            System.out.println();
            i++;
        }
    }
}