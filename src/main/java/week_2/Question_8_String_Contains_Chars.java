package week_2;

import static input.InputUtils.stringInput;

/**

  Finish this program to test if a String contains all of the
  punctuation characters from the number keys on a standard US keyboard:

  !@#$%^&*()
 
 So, the String "abc!@#$%^&*()def" contains all the characters.
 The String ")(*&^%$#@!" contains all the characters.
 The String "a)(b*&c^%d$#e@!" contains all the characters.
 
 The String "abc$*^def" does not.
 
 Your code should NOT use 10 if statements!
 
 In your program, finish the method that tests if a String contains all the
 characters in another String. Make sure this method would work with any two input Strings.
 
 */
public class Question_8_String_Contains_Chars {

    static final String PUNCTUATION = "!@#$%^&*()";

    public static void main(String[] args) {
    
        // You don't need to modify the main method.
        
        String testString = stringInput("Enter the string to test: ");

        boolean containsChars = containsChars(PUNCTUATION, testString);

        System.out.printf("Does the string %s contain all the characters %s? %b", testString, PUNCTUATION, containsChars);

    }

    public static boolean containsChars(String characters, String testString) {

        // TODO check if the String testString contains all the characters in the String characters
        // Example: if characters = "!@#$%^&*()" and testString = "!Q@W#E$R%T^Y&U*I(O)P" return true
        // Example: if characters = "!@#$%^&*()" and testString = "** Hello! (Java)" return false
        // Example: if characters = "QWERTY" and testString = "The first row of keys on a US keyboard is 'QWERTYUIOP'" return true
        // Example: if characters = "QWERTY" and testString = "qwerty" return false
    
        // Make sure your method works with any Strings in the characters and testString variable.
        
        
        return false;
    }

}


