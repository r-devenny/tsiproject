import java.util.*;
public class GameEngine {
    public static void main(String[] args) throws Exception {

        GetWords getWords = new GetWords();

        String rawWord = getWords.getSingleWord();

        Word word = new Word(rawWord);

        DisplayScreen display = new DisplayScreen();



    }
}
