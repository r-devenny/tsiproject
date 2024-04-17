import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;



public class GetWords {

    public List<String> getWords() {
        List<String> words = new ArrayList<String>();
        try {
            words = Files.readAllLines(Paths.get("resources/words.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }

    public String getSingleWord() {
        List<String> words = getWords();
        Random random = new Random();
        int index = random.nextInt(words.size());
        String word = words.remove(index);
        return word;
    }

}



