import java.io.*;
import java.util.*;

public class FileWordCount {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount inputFile.txt outputFile.txt");
            return;
        }

        String inputFileName = args[0];
        String outputFileName = args[1];

        Map<String, Integer> wordCountMap = countWordsInFile(inputFileName);
        writeWordCountToFile(wordCountMap, outputFileName);
    }

    private static Map<String, Integer> countWordsInFile(String fileName) {
        Map<String, Integer> wordCountMap = new TreeMap<>();
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNext()) {
                String word = fileScanner.next().toLowerCase();
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File '" + fileName + "' not found.");
        }
        return wordCountMap;
    }

    private static void writeWordCountToFile(Map<String, Integer> wordCountMap, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                writer.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("Word count written to '" + fileName + "'.");
        } catch (IOException e) {
            System.out.println("Error writing to file '" + fileName + "'.");
        }
    }
}