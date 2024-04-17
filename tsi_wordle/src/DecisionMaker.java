import java.util.HashMap;
public class DecisionMaker {

        public Word compareGuess(Word userGuess, Word target) {
            HashMap<Character, String> userLetters = userGuess.getLetters();
            HashMap<Character, String> targetLetters = target.getLetters();
    
            for (char letter : targetLetters.keySet()) {
                if (userLetters.containsKey(letter)) {
                    int targetIndex = getIndex(target, letter);
                    int guessIndex = getIndex(userGuess, letter);
                    
                    if (targetIndex == guessIndex) {
                        userLetters.put(letter, "correct");
                    } else if (targetIndex == -1 | guessIndex == -1) {
                        userLetters.put(letter, "default");
                    } 
                    else {
                        userLetters.put(letter, "contains");
                    }
                }
            }
            userGuess.setLetters(userLetters);
            return userGuess;
        }
    
        // Helper method to get the index of a letter in a word
        private static int getIndex(Word word, char letter) {
            int index = 0;
            for (char c : word.getLetters().keySet()) {
                if (c == letter) {
                    return index;
                }
                index++;
            }
            return -1; // Return -1 if the letter is not found
        }
    }
    
