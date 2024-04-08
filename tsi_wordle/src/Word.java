import java.util.HashMap;


public class Word {

    private HashMap<Character, String> Letters; // Hashmap where key is the letter and the value is the colour representing its state in the guess

    public Word(String fullWord) { 
     
        for (char letter: fullWord.toCharArray()){
            Letters.put(letter, "default");
        }

    }

    public HashMap<Character, String> getLetters() {
        return Letters;
    }


}
