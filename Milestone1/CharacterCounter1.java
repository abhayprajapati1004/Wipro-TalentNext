import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterCounter1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        System.out.print("Enter the character to be counted: ");
        char character = scanner.next().charAt(0);
        scanner.close();

        int count = countCharacterInFile(fileName, character);
        if (count != -1) {
            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + character + "'.");
        }
    }

    private static int countCharacterInFile(String fileName, char character) {
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            int count = 0;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().toLowerCase();
                for (char c : line.toCharArray()) {
                    if (Character.toLowerCase(c) == Character.toLowerCase(character)) {
                        count++;
                    }
                }
            }
            return count;
        } catch (FileNotFoundException e) {
            System.out.println("File '" + fileName + "' not found.");
            return -1;
        }
    }
}