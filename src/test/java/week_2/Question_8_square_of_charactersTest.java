package week_2;

import input.InputUtils;
import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.easymock.EasyMock.anyString;
import static org.easymock.EasyMock.expect;
import static org.powermock.api.easymock.PowerMock.*;


@RunWith(PowerMockRunner.class)
@PrepareForTest(InputUtils.class)
public class Question_8_square_of_charactersTest extends TestCase {
    
    public void testPrintSquare() throws Exception {

        Question_8_square_of_characters squarer = new Question_8_square_of_characters();

        int size = 3;
        String ch = "*";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        squarer.printSquare(size, ch);

        String expectedOut = "***\n***\n***";
        // Assert that  "%%%%\n%%%%\n%%%%\n%%%%" is printed

        String actualOut = out.toString();

        System.out.println(expectedOut);
        System.out.println(actualOut);

        assertTrue("Your program printed \n " + actualOut + " which doesn't seem to be a square(?)",  actualOut.contains(expectedOut));

    }


    public void testGetCharacter() {

        mockStatic(InputUtils.class);
        expect(InputUtils.stringInput(anyString()))
                .andReturn("")        // Too short
                .andReturn("123456")  // Too long
                .andReturn("Q");      // Exactly 1 character
        replay(InputUtils.class);

        Question_8_square_of_characters squarer = new Question_8_square_of_characters();

        assertEquals("getCharacter should only accept Strings of one character", "Q", squarer.getCharacter());

        // Valid input
        reset(InputUtils.class);
        expect(InputUtils.stringInput(anyString()))
                .andReturn("Q");      // Exactly 1 character
        replay(InputUtils.class);

        squarer = new Question_8_square_of_characters();

        assertEquals("getCharacter should only accept Strings of one character", "Q", squarer.getCharacter());


    }

    public void testGetSquareSize() {

        mockStatic(InputUtils.class);
        expect(InputUtils.intInput(anyString()))
                .andReturn(-1)      // Negative not valid
                .andReturn(0)       // 0 not valid
                .andReturn(101)     // too large
                .andReturn(4);      // 4 is good
        replay(InputUtils.class);

        Question_8_square_of_characters squarer = new Question_8_square_of_characters();

        assertEquals("getSquareSize should not accept 0 or negative numbers", 4, squarer.getSquareSize());



        // Valid input
        reset(InputUtils.class);
        expect(InputUtils.intInput(anyString()))
                .andReturn(5);
        replay(InputUtils.class);


        assertEquals("getSquareSize should accept 5 as valid input", 5, squarer.getSquareSize());


    }

}