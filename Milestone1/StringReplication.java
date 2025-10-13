public class StringReplication {
    public static String replicateString(String str) {
        if (str.length() < 2) {
            return str.repeat(str.length());
        }
        String firstTwoChars = str.substring(0, 2);
        return firstTwoChars.repeat(str.length());
    }

    public static void main(String[] args) {
        System.out.println(replicateString("Wipro")); // WiWiWiWiWiWi
    }
}