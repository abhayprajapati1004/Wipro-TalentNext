import java.util.Scanner;

public class ColorMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a color code (R, B, G, O, Y, W): ");
        String colorCode = scanner.next().toUpperCase();
        scanner.close();

        String colorName = getColorName(colorCode);

        System.out.println(colorName);
    }

    public static String getColorName(String code) {
        switch (code) {
            case "R":
                return "Red";
            case "B":
                return "Blue";
            case "G":
                return "Green";
            case "O":
                return "Orange";
            case "Y":
                return "Yellow";
            case "W":
                return "White";
            default:
                return "Invalid Code";
        }
    }
}
