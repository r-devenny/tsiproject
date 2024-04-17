import java.util.HashMap;


public class Word {

    private HashMap<Character, String> letters; // Hashmap where key is the letter and the value is the colour representing its state in the guess

    public Word(String fullWord) {
        this.letters = new HashMap<>(); // Initialize the hashmap
        for (char letter : fullWord.toCharArray()) {
            this.letters.put(letter, "default");
        }
    }

    public HashMap<Character, String> getLetters() {
        return letters;
    }

    public void setLetters(HashMap<Character, String> letters) {
        this.letters = letters;
    }


}
