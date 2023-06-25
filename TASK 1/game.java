import java.util.Scanner; 

public class game {
    public static void main(String[] args) {        // Start the Game..
        System.out.println("\n************GUESS THE NUMBER**********************\n");
        System.out.println("Let's Play the Game !! ");
        System.out.println("\n RULE : \n 1. You have to guess number between 1 to 100.");
        System.out.println(" 2. You have only 6 attempts to guess correct..");
        
        Scanner sc = new Scanner(System.in); 
        boolean playAgain;
        
        do {                //Play again code..
            playGame();  
            System.out.println("Would you like to play again? Y/N : ");
            String playAgainStr = sc.next();
            playAgain = playAgainStr.equalsIgnoreCase("Y");
        } while (playAgain);
        
        System.out.println("Thanks for playing. Goodbye !!\n\n");
    }
    static void playGame() {
        int computersNumber; // The number the computer has chosen
        int usersGuess;      // The user's current guess
        int guessCount;      // The number of guesses the user has made
        computersNumber = (int)(100 * Math.random()) + 1;
        guessCount = 0;
        
        System.out.println();
        System.out.println("What is your first guess? : ");
        Scanner sc= new Scanner(System.in);   
        
        while (true) {
            usersGuess = sc.nextInt(); // Read the user's guess            
            guessCount++;            
            if (usersGuess == computersNumber) {
                System.out.println("Yes ! You got it correct !! You got it in " + guessCount);
                break;  
            }            
            if (guessCount == 6) {
                System.out.println("You didn't get the number in 6 guesses...");
                System.out.println("You lose!! My number was " + computersNumber +"\n Better Luck next time !! ");
                break;  
            }            
            if (usersGuess < computersNumber) {
                System.out.println("Your number is too low !! Try again :");
            }            
            else if (usersGuess > computersNumber) {
                System.out.println("Your number is too high !! Try again :");
            }
        }
        
        System.out.println();
    } 
}