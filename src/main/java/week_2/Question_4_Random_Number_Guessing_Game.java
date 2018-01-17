package week_2;

import java.util.Random;

import static input.InputUtils.*;

/**
 *
 Your program should generate a random number between 1 and 10,
 and challenge the user to guess the number.

 Write a loop that asks the user to guess a number that the computer
 is thinking of. Print a success message if they guess correctly.

 If the user does not guess correctly, tell the user that they need to guess
 higher, or lower, and ask the user to try again.

 The user should be able to have as many guesses as they need.

 Once the user guesses correctly, tell the user how many guesses they needed to
 get the right number.
 
 Read the instructions in the TODO messages.

 */

public class Question_4_Random_Number_Guessing_Game {

    Random rnd = new Random();

    String CORRECT = "Correct!!";
    String LOW = "Too low";
    String HIGH = "Too high";

    public static void main(String[] args) {

        int guessesNeeded = new Question_4_Random_Number_Guessing_Game().play();

        // printf is a shortcut for System.out.println(String.format("You guessed the number in %d guesses\n", guessesNeeded));
        
        System.out.printf("You guessed the number in %d guesses\n", guessesNeeded);

    }

    public int play() {

        int secret = generateSecretNumber(1, 10);

        int guessesNeeded = 0;

        while (true) {

            // TODO ask user for their guess
            int guess = 0;   // Replace with your code

            
            // TODO increase guessesNeeded

            
            String result = checkGuess(secret, guess);

            
            // TODO print the result - too high, too low, or correct.
            
            
            // TODO Check if result is correct. If so, end the loop.
            // Use the global CORRECT variable in your if statement
            break;  // TODO remove and replace with your check

        }

        return guessesNeeded;
    
    }

    public String checkGuess(int secret, int guess) {
        
        // TODO Return CORRECT if secret is the same as guess - use the global CORRECT variable
        // TODO Return LOW if guess is too low - use the global LOW variable
        // TODO return HIGH if guess is too high- use the global HIGH variable
        
        return null;   //replace with your code
        
    }

    public int generateSecretNumber(int min, int max) {
        
        // TODO generate a random number between min and max, inclusive of min and max
        // The smallest value possible should be min
        // The largest value possible should be max
        // Example: if min = 4 and max = 7, the random number should be a random selected value from 4, 5, 6, 7.
        // Use the global Random rnd variable (declared at the top of the program) to generate the number. Don't create another Random.
        
        return 0;  //replace with your code
        
    }
    
}
