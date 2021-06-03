import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("text.txt");
        Scanner inFile = null;
        try {
            inFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Problem: file not found");
        }
        String test = inFile.nextLine();
        String[] words = test.split(" ");
        Map<String, Integer> wordStatistic = new HashMap<>();
        for (String word : words) {
            if (wordStatistic.containsKey(word)) {
                int count = wordStatistic.get(word)+1;
                wordStatistic.replace(word, count);
            }
            else {
                wordStatistic.put(word, 1);
            }
        }

        wordStatistic.forEach((key, value) -> System.out.println("Word: " + key + " count: " + value));
    }
}
