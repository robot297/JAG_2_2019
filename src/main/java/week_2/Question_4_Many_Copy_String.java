package week_2;

import static input.InputUtils.*;

/**
 * Finish the multiplyString method to create a String from many copies of itself.
 * The user will decide how many copies to make.
 *
 * If the method is given the String "cat" and repeats = 3 copies, it will return "catcatcat".
 * If the method is given the String "Hello" and repeats = 5 copies, it will return "HelloHelloHelloHelloHello".
 *
 * If the method is given the String "Hello" and repeats = 1 copies, it will return "Hello".
 * If the method is given the String "Hello" and repeats = 0 copies, it will return "". (An empty String)
 * If the method is given the String "Hello" and repeats = -1 copies, or any negative number it will return "". (An empty String)
 
 */

public class Question_4_Many_Copy_String {
    
    public static void main(String[] args) {
        
        // You don't need to modify the main method.
        
        String input = stringInput("Enter your string to multiply: ");
        int copies = intInput("How many copies to make?");
        
        String output = multiplyString(input, copies);
    
        System.out.println(String.format("Your String %d times is: %s", copies, output));
        
    }
    
    public static String multiplyString(String userString, int repeats) {
        
        // TODO return a String that is made of multiple copies of userString.
        // The variable called repeats contains the number of copies.
        // So if userString = "Java" and repeats = 2 this method should return "JavaJava".
        // If userString = "Java" and repeats = 0, or repeats is negative, this method should return ""  (an empty String)
      
        // TODO delete this line and replace this with your code
        return null;
        
    }
    
}
