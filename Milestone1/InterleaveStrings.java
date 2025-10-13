public class InterleaveStrings {
    public static String interleaveStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());
        for (int i = 0; i < maxLength; i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(interleaveStrings("Hello", "World")); 
    }
}