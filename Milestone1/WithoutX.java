public class WithoutX {
    public static String withoutX(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("America")); 
    }
}