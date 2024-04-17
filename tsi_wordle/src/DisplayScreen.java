public class DisplayScreen {

    public void displayStartPage(){
        System.out.println("Welcome to my Wordle Game! \n \n");

        System.out.println("------------------------------------");
    }

    public void displayGameBoard(Word word){
        System.out.println("------------------------------------ \n");
        for (Character letter : word.getLetters().keySet()){
            if (word.getLetters().get(letter).equals("correct")){
                System.out.println("\033[0;32m"+ "[ " + letter + " ]" ); //ANSI escape codes used for the colours
            } else if (word.getLetters().get(letter).equals("present")){
                System.out.println("\033[0;33m"+ "[ " + letter + " ]" );
            } else if (word.getLetters().get(letter).equals("default")){
                System.out.println("\033[0;37m" + "[ " + letter + " ]" );
            }
            else {
                System.out.println("Error with printing board, stopping game ");
                System.exit(0);
            }
            System.out.println("\033[0m"); // Reset color
        }
        System.out.println("\n ------------------------------------ \n");
    }
    
}
