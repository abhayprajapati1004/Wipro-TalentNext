public class RemoveAroundStar {
    public static String removeAroundStar(String str) {
        int starIndex = str.indexOf('*');
        if (starIndex == -1) {
            return str;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == starIndex - 1 || i == starIndex || i == starIndex + 1) {
                continue;
            }
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeAroundStar("ab*cd"));  
    }
}