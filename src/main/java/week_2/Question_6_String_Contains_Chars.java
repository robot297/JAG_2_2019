package week_2;

import static input.InputUtils.stringInput;

/**

  Write a program to test if a String contains all of the
  punctuation characters from the number keys on a standard US keyboard:

  !@#$%^&*()
 
 So, the String "abc!@#$%^&*()def" contains all the characters.
 The String ")(*&^%$#@!" contains all the characters.
 The String "a)(b*&c^%d$#e@!" contains all the characters.
 
 The String "abc$*^def" does not.

  Write a program to test if an example String contains all of these characters or not.
  Your code should NOT use 10 if statements!

 */
public class Question_6_String_Contains_Chars {

    String punctuation = "!@#$%^&*()";

    public static void main(String[] args) {
    
        Question_6_String_Contains_Chars q7 = new Question_6_String_Contains_Chars();

        String testString = stringInput("Enter the string to test: ");

        boolean containsChars = q7.testContainsChars(testString);

        System.out.println("Does the string contain all the characters? " + containsChars);

    }

    public boolean testContainsChars(String testString) {

        // TODO check if testString contains all the punctuation characters being tested.
        return false;
    }

}


