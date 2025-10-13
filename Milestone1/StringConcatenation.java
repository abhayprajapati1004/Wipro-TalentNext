public class StringConcatenation {
    public static String concatenateStrings(String str1, String str2) {
        String result = (str1 + str2).toLowerCase();
        if (result.length() > 1 && result.charAt(result.length() - 1) == result.charAt(result.length() - 2)) {
            return result.substring(0, result.length() - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(concatenateStrings("Sachin", "Tendulkar")); // sachin tendulkar
        System.out.println(concatenateStrings("Mark", "kate")); // markate
    }
}