package CountWords;
import java.io.File;
import java.util.*;

/**
 * max count of words
 */
public class CountWords {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("D:\\tekst.txt"),"windows-1251");
            Set<String> words = new TreeSet<>();
            Map<String, Integer> statistics = new HashMap<>();
            String maxCountW = "";
            int maxCount = 0;
            while (scanner.hasNext()) {
                String word = scanner.useDelimiter("\\s+").next();
                words.add(word);
                Integer countw = statistics.get(word);
                if (countw == null) {
                    countw = 0;
                }
                statistics.put(word, ++countw);
                if (maxCount<countw){
                    maxCount = countw;
                    maxCountW = word;
                }
            }
            System.out.println(words);
            System.out.println(statistics);
            System.out.println("Максимальное число повторений: " + maxCount + " у слова " + maxCountW);
        } catch (Exception exception) {
            System.out.println("File not found");
        }
    }
}

