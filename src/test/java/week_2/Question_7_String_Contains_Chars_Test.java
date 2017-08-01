package week_2;

import junit.framework.TestCase;
import org.junit.Test;

public class Question_7_String_Contains_Chars_Test extends TestCase {
    
    @Test
    public void testTestContainsChars() throws Exception {

        Question_7_String_Contains_Chars q7 = new Question_7_String_Contains_Chars();

        assertTrue(q7.testContainsChars("!@#$%^&*()"));
        assertTrue(q7.testContainsChars("!@#$s%ert^4&s*(2)asddf@#$@#$%^"));
        assertTrue(q7.testContainsChars(")*^$@(&%#!"));


        assertFalse(q7.testContainsChars(")(*&^%#@!"));
        assertFalse(q7.testContainsChars("QWERTYUSDFGHJ"));
        assertFalse(q7.testContainsChars("!"));

    }
}