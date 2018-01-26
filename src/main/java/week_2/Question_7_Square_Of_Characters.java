package week_2;

import static input.InputUtils.intInput;
import static input.InputUtils.positiveIntInput;
import static input.InputUtils.stringInput;

/**
 *
 * Write a program that displays a square of characters
 * of any size, between 1 and 100 characters.
 *
 * The user should be able to enter a size, a character, and
 * your program will use loops to display a square.
 *
 * So, if the user enters 4, and the character "%"
 * your program will display

 %%%%
 %%%%
 %%%%
 %%%%

 The getSquareSize method has been written for you.
 
 */


public class Question_7_Square_Of_Characters {

    // You don't need to modify these variables
    static int MIN_SIZE = 1;
    static int MAX_SIZE = 100;

    public static void main(String[] args) {
    
        // You don't need to modify the main method.
        
        Question_7_Square_Of_Characters squarer = new Question_7_Square_Of_Characters();
        int size = squarer.getSquareSize();
        String character = squarer.getCharacter();
        squarer.printSquare(size, character);

    }

    /* Get a positive number for the square size. You don't need to modify this method. */
    public int getSquareSize() {
    
        // You don't need to modify this method.
    
        // Input validation. The square size must be positive.

        int size = -1;

        // Loop while user-entered size is less than the minimum, or larger than the maximum
        while (size < MIN_SIZE || size > MAX_SIZE) {
            size = positiveIntInput("Enter a number between 1 and 100 for the square size");
        }

        return size;
    }


    public String getCharacter() {

        // TODO ask user for character
        // TODO input validation - make sure user enters a string of length = 1.

        return null;  // Replace with your code

    }



    public void printSquare(int size, String character) {

        // TODO print a square of characters, of the given size.
        
    }
}
