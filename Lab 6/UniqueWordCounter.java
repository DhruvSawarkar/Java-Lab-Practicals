import java.io.*;
import java.util.*;
import java.util.regex.*;

public class UniqueWordCounter {


    private static List<String> extractWords(String line) {
 
        line = line.toLowerCase().replaceAll("[^a-z0-9\\s]", " ");
        return Arrays.asList(line.split("\\s+"));
    }

  
    public static void countUniqueWords(String filePath) {
        Set<String> uniqueWords = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (String word : extractWords(line)) {
                    if (!word.isEmpty()) {
                        uniqueWords.add(word);
                    }
                }
            }
            System.out.println("✅ Unique word count (HashSet): " + uniqueWords.size());
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }


    public static void listUniqueWordsAlphabetically(String filePath) {
        Set<String> sortedWords = new TreeSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (String word : extractWords(line)) {
                    if (!word.isEmpty()) {
                        sortedWords.add(word);
                    }
                }
            }

            System.out.println("\n📚 Unique words in alphabetical order (TreeSet):");
            for (String word : sortedWords) {
                System.out.println(word);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "sample.txt";

        countUniqueWords(filePath);        
        listUniqueWordsAlphabetically(filePath); 
    }
}