public class RepeatLastNChars {
    public static String repeatLastNChars(String str, int n) {
        String lastNChars = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatLastNChars("Wipro", 3));
    }
}