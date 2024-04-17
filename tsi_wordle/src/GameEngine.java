import java.util.Scanner;
public class GameEngine {
    
    public static Word getAGuess(){

        System.out.println("Enter your guess: ");

        Scanner input = new Scanner(System.in);

        String guessInput = input.nextLine();

        Word userGuess = new Word(guessInput);

        

        return userGuess;
    }
    
    public static void main(String[] args) throws Exception {

        GetWords getWords = new GetWords();

        String rawWord = getWords.getSingleWord();

        Word word = new Word(rawWord);

        DisplayScreen display = new DisplayScreen();

        display.displayStartPage();

        DecisionMaker decisionMaker = new DecisionMaker();

        for (int i = 0; i < 6; i++) {

            Word guess = getAGuess();

            guess = decisionMaker.compareGuess(guess, word);

            display.displayGameBoard(guess);

        }

    }
}
