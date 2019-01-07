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
    
    public static void main(String[] args) {
    
        // You don't need to modify the main method.
        
        final int MIN_SIZE = 1;
        final int MAX_SIZE = 100;
    
        Question_7_Square_Of_Characters squarer = new Question_7_Square_Of_Characters();
        int size = squarer.getSquareSize(MIN_SIZE, MAX_SIZE);
        String character = squarer.getCharacter();
        String square = squarer.buildSquare(size, character);
        System.out.println(square);

    }

    /* Get a positive number for the square size. You don't need to modify this method. */
    public int getSquareSize(int min, int max) {
    
        // You don't need to modify this method.
    
        // Input validation. The square size must be positive, and between MIN_SIZE and MAX_SIZE

        int size = -1;

        // Loop while user-entered size is less than the minimum, or larger than the maximum
        while (size < min || size > max) {
            System.out.println("SIZE" + size);
            size = positiveIntInput("Enter a number between 1 and 100 for the square size");
        }

        return size;
    }


    public String getCharacter() {

        // TODO ask user for character
        // TODO input validation - make sure user enters a string of length = 1.

        return null;  // Replace with your code

    }



    public String buildSquare(int size, String character) {

        // TODO create and return a String that's a square of characters, of the given size.
        // Example: A 3x3 square of $ is the String "$$$\n$$$\n$$$"
        
        // TODO replace with your code
        return null;
    }
}
