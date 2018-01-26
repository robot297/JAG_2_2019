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
    public void testPrintSquare() throws Exception {

        Question_7_Square_Of_Characters squarer = new Question_7_Square_Of_Characters();

        int size = 3;
        String ch = "*";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        squarer.printSquare(size, ch);

        String expectedOut = "***\n***\n***";
        // Assert that  "%%%%\n%%%%\n%%%%\n%%%%" is printed

        String actualOut = out.toString().replace("\r", "");

        System.out.println(expectedOut);
        System.out.println(actualOut);

        assertTrue("Your program printed \n " + actualOut + " which doesn't seem to be a square(?)",  actualOut.contains(expectedOut));

    }
    
    
    @Test(timeout=3000)
    public void testGetCharacter() {

        mockStatic(InputUtils.class);
        expect(InputUtils.stringInput(anyString()))
                .andReturn("")        // Enter something that's too short
                .andReturn("123456")  // Enter something that's too long
                .andReturn("Q");      // Exactly 1 character
        replay(InputUtils.class);

        Question_7_Square_Of_Characters squarer = new Question_7_Square_Of_Characters();

        assertEquals("getCharacter should only accept Strings of exactly one character. Do not accept empty Strings as input.", "Q", squarer.getCharacter());

        // Valid input
        reset(InputUtils.class);
        expect(InputUtils.stringInput(anyString()))
                .andReturn("Q");      // Exactly 1 character
        replay(InputUtils.class);

        squarer = new Question_7_Square_Of_Characters();

        assertEquals("getCharacter should only accept Strings of exactly one character.  Do not accept empty Strings as input.", "Q", squarer.getCharacter());


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
    
        assertEquals("getSquareSize should not accept 0 or negative numbers", 4, squarer.getSquareSize());
    
    }
    
    
    @Test(timeout=3000)
    public void testGetSquareSizeValid() {
        
        // Valid input
        mockStatic(InputUtils.class);
        expect(InputUtils.positiveIntInput(anyString()))
                .andReturn(5);
        replay(InputUtils.class);
    
        Question_7_Square_Of_Characters squarer = new Question_7_Square_Of_Characters();
        assertEquals("getSquareSize should accept 5 as valid input", 5, squarer.getSquareSize());


    }

}