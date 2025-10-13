public class AlphabeticalOrder {
    public static void main(String[] args) {
        char char1 = 's';
        char char2 = 'e';

        if (char1 < char2) {
            System.out.println(char1 + "," + char2);
        } else {
            System.out.println(char2 + "," + char1);
        }
    }
}