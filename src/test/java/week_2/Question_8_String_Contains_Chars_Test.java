package week_2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static week_2.Question_8_String_Contains_Chars.containsChars;


public class Question_8_String_Contains_Chars_Test {
    
    @Test(timeout=3000)
    public void testTestContainsPunctuationChars() throws Exception {
    
        String msg = "When called with the following String \"%s\", containsChars should return %b";
    
        String[] containsChars = {"!@#$%^&*()", "!@#$s%ert^4&s*(2)asddf@#$@#$%^", ")*^$@(&%#!"};
    
    
        for (String input : containsChars) {
            assertTrue(String.format(msg, input, true), containsChars(Question_8_String_Contains_Chars.PUNCTUATION, input));
        }
    
    
        String[] doesntContainChars = {"!@$%^&*()", "sdfsdfsdfsdf", "!", "#$%#$sdfsfsdf"};
    
        for (String input : doesntContainChars) {
            assertFalse(String.format(msg, input, false), containsChars(Question_8_String_Contains_Chars.PUNCTUATION, input));
        }
    
    }
    
    
    @Test(timeout=3000)
    public void testTestContainsChars() throws Exception {
        
        // Verify the method also works with other test strings, and other sets of characters to test
        
        assertFalse("If containsChars is called with characters \"ABC\" and testString \"hello\" it should return false.",
                containsChars("ABC", "hello"));
    
    
        assertFalse("If containsChars is called with characters \"ABC\" and testString \"abc\" it should return false.",
                containsChars("ABC", "hello"));
    

        assertTrue("If containsChars is called with characters \"ABC\" and testString \"BCA\" it should return true.",
                containsChars("ABC", "BCA"));
    
    
        assertTrue("If containsChars is called with characters \"ABC\" and testString \"Beyonce Created An Album\" it should return true.",
                containsChars("ABC", "Beyonce Created An Album"));
    
    
    
    }
}