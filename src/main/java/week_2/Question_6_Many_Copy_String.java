package week_2;

import static input.InputUtils.positiveIntInput;
import static input.InputUtils.stringInput;

/**
 * Finish the multiplyString method to create a String from many copies of itself.
 * The user will decide how many copies to make.
 *
 * If the method is given the String "cat" and n = 3 copies, it will return "catcatcat".
 * If the method is given the String "Hello" and n = 5 copies, it will return "HelloHelloHelloHelloHello".
 *
 * If the method is given the String "Hello" and n = 1 copies, it will return "Hello".
 * If the method is given the String "Hello" and n = 0 copies, it will return "". (An empty String)
 * If the method is given the String "Hello" and n = -1 copies, or any negative number it will return "". (An empty String)
 
 */

public class Question_6_Many_Copy_String {
    
    public static void main(String[] args) {
        
        // You don't need to modify the main method.
        
        String input = stringInput("Enter your string to multiply: ");
        int copies = positiveIntInput("How many copies to make?");
        
        String output = multiplyString(input, copies);
    
        System.out.println(String.format("Your String %d times is: %s", copies, output));
        
        
    }
    
    public static String multiplyString(String userString, int n) {
        
        // TODO return a String that is n copies of the original String.
        // So if userString = "Java" and n is 2 this method should return "JavaJava".
        // If userString = "Java" and n is 0, or n is negative, this method should return ""  (an empty String)
      
        // TODO replace this with your code
        return null;
        
    }
    
}
