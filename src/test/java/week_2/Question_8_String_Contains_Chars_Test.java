package week_2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static week_2.Question_8_String_Contains_Chars.testContainsChars;


public class Question_8_String_Contains_Chars_Test {
    
    @Test(timeout=3000)
    public void testTestContainsChars() throws Exception {
    
        String msg = "When called with the following String \"%s\", testContainsChars should return %b";
    
        String[] containsChars = {"!@#$%^&*()", "!@#$s%ert^4&s*(2)asddf@#$@#$%^", ")*^$@(&%#!"};
        
        
        for (String input : containsChars) {
            assertTrue(String.format(msg, input, true), testContainsChars(input));
        }
    
    
        String[] doesntContainChars = {"!@$%^&*()", "sdfsdfsdfsdf", "!", "#$%#$sdfsfsdf"};
    
        for (String input : doesntContainChars) {
            assertFalse(String.format(msg, input, false), testContainsChars(input));
        }
    
    
    }
}