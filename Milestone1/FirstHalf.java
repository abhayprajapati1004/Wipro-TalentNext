public class FirstHalf {
    public static String firstHalf(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(firstHalf("TomCat")); 
        System.out.println(firstHalf("Apron")); 
    }
}