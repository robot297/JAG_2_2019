package week_2;

import input.InputUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
import static org.easymock.EasyMock.anyString;
import static org.easymock.EasyMock.expect;
import static org.junit.Assert.assertTrue;
import static org.powermock.api.easymock.PowerMock.*;


@RunWith(PowerMockRunner.class)
@PrepareForTest(InputUtils.class)
public class Question_7_Square_Of_CharactersTest {
    
    
    @Test(timeout=3000)
    public void testPrintSquare() {

        Question_7_Square_Of_Characters squarer = new Question_7_Square_Of_Characters();

        int size = 3;
        String ch = "*";
        
        String square = squarer.buildSquare(size, ch);

        String expectedOut = "***\n***\n***";
        // Assert that  "%%%%\n%%%%\n%%%%\n%%%%" is printed

        String actualOut = square.replace("\r", "");
        
        assertTrue("Your program printed \n " + actualOut + " which doesn't seem to be a square(?)",  actualOut.contains(expectedOut));

    }
    
    
    @Test(timeout=3000)
    public void testGetCharacterInvalid() {

        mockStatic(InputUtils.class);
        expect(InputUtils.stringInput(anyString()))
                .andReturn("")        // Enter something that's too short
                .andReturn("123456")  // Enter something that's too long
                .andReturn("ab")  // Enter something that's too long
                .andReturn("Q");      // Exactly 1 character
        replay(InputUtils.class);

        Question_7_Square_Of_Characters squarer = new Question_7_Square_Of_Characters();

        assertEquals("getCharacter should only accept Strings of exactly one character. Do not accept empty Strings as input.", "Q", squarer.getCharacter());
        
    }
    
    
    @Test(timeout=3000)
    public void testGetCharacterValid() {
        
        mockStatic(InputUtils.class);
        
        reset(InputUtils.class);
        expect(InputUtils.stringInput(anyString()))
                .andReturn("^");      // Exactly 1 character
        replay(InputUtils.class);
    
        Question_7_Square_Of_Characters squarer = new Question_7_Square_Of_Characters();
    
        assertEquals("getCharacter should accept Strings of exactly one character e.g. '^' ", "^", squarer.getCharacter());
    
    
    
        mockStatic(InputUtils.class);
    
        reset(InputUtils.class);
        expect(InputUtils.stringInput(anyString()))
                .andReturn("2");      // Exactly 1 character
        replay(InputUtils.class);
    
        squarer = new Question_7_Square_Of_Characters();
    
        assertEquals("getCharacter should accept Strings of exactly one character e.g. '2'.", "2", squarer.getCharacter());
    
    
    }
    
    
    @Test(timeout=3000)
    public void testGetSquareSizeInvalid() {
    
        mockStatic(InputUtils.class);
        expect(InputUtils.positiveIntInput(anyString()))
                .andReturn(-1)      // Negative not valid
                .andReturn(0)       // 0 not valid
                .andReturn(101)     // too large
                .andReturn(4);      // 4 is good
    
        
        replay(InputUtils.class);
    
        Question_7_Square_Of_Characters squarer = new Question_7_Square_Of_Characters();
    
        assertEquals("getSquareSize should not accept negative numbers, or numbers smaller than min or larger than max",
                4, squarer.getSquareSize(1, 100));
    
    }
    
    
    @Test(timeout=3000)
    public void testGetSquareSizeValid() {
        
        // Valid input
        mockStatic(InputUtils.class);
        expect(InputUtils.positiveIntInput(anyString()))
                .andReturn(5);
        replay(InputUtils.class);
    
        Question_7_Square_Of_Characters squarer = new Question_7_Square_Of_Characters();
        assertEquals("getSquareSize should accept 5 as valid input", 5, squarer.getSquareSize(1, 100));


    }

}