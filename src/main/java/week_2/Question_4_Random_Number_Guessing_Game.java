package week_2;

import java.util.Random;

import static input.InputUtils.*;

/**
 *
 Your program should generate a random number between 0 and 9,
 and challenge the user to guess the number.

 Write a loop that asks the user to guess a number that the computer
 is thinking of. Print a success message if they guess correctly.

 If the user does not guess correctly, tell the user that they need to guess
 higher, or lower, and ask the user to try again.

 The user should be able to have as many guesses as they need.

 Read the instructions in the TODO messages.

 */

public class Question_4_Random_Number_Guessing_Game {

    Random rnd = new Random();

    String CORRECT = "Correct!!";
    String LOW = "Too low";
    String HIGH = "Too high";

    public static void main(String[] args) {
        new Question_4_Random_Number_Guessing_Game().play();
    }
    

    public void play() {

        int secret = generateSecretNumber(10);

        while (true) {

            // ask user for their guess
            int guess = getGuess();
            
            // Check if the guess is correct
            String result = checkGuess(secret, guess);
            // Print the result (correct, too high, too low) for the user
            System.out.println(result);
            
            // TODO Write an if-statement comparing the global CORRECT variable to result
            // to test if result is correct. If so, end the loop with a break statement
            
        }
        
    }
    
    public int getGuess() {
        
        // TODO use intInput to print a message like "Enter your guess?" and get the user's guess.
        // TODO modify the following line to return the number the user entered.
        return 0;
        
    }

    public String checkGuess(int secret, int guess) {
        
        // TODO Return CORRECT if secret is the same as guess - use the global CORRECT variable
        // TODO Return LOW if guess is too low - use the global LOW variable
        // TODO return HIGH if guess is too high - use the global HIGH variable
        
        return null;   //replace with your code
        
    }

    public int generateSecretNumber(int max) {
        
        // TODO generate a random number between 0 and max-1
        // The smallest value possible should be 0
        // The largest value possible should be max - 1
        // Example: if max = 4, the random number should be a random selected value from 0, 1, 2, 3
        // Use the global Random rnd variable (declared at the top of the program) to generate the number. Don't create another Random.
        
        return 0;  //replace with your code
        
    }
    
}
