package week_2;

import input.InputUtils;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Random;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;
import static org.powermock.api.easymock.PowerMock.mockStatic;


@RunWith(PowerMockRunner.class)
@PrepareForTest({InputUtils.class, Random.class})
public class Question_4_Random_Number_Guessing_GameTest {
    
    @Test
    public void testCorrect() throws Exception {

        Question_4_Random_Number_Guessing_Game q4 = new Question_4_Random_Number_Guessing_Game();
        assertEquals(q4.CORRECT, q4.checkGuess(3, 3));
        assertEquals(q4.CORRECT, q4.checkGuess(10, 10));

        assertEquals(q4.HIGH, q4.checkGuess(4, 10));
        assertEquals(q4.LOW, q4.checkGuess(10, 4));

    }

    @Test
    public void testGenerateSecretNumber() throws Exception {

        // Mock the random number generator and verify the
        // method returns the mock's output.

        Question_4_Random_Number_Guessing_Game q4 = new Question_4_Random_Number_Guessing_Game();

        int min = 1, max = 10;
        int nextIntVal = 6;   //This is the value that rnd.nextInt will return

        // For min = 1, max = 10, force the rnd generator to generate 6 and then function should return 7
        
        q4.rnd = createNiceMock(Random.class);
        expect(q4.rnd.nextInt(max-min)).andReturn(nextIntVal);
        EasyMock.replay(q4.rnd);

        assertEquals(nextIntVal + min, q4.generateSecretNumber(min, max));


        // Verify method is using the arguments correctly

        min = 20; max = 44;
        nextIntVal = 32;

        q4.rnd = createNiceMock(Random.class);
        expect(q4.rnd.nextInt(max-min)).andReturn(nextIntVal);
        EasyMock.replay(q4.rnd);

        assertEquals("Ensure you use the min and max arguments", nextIntVal + min, q4.generateSecretNumber(min, max));

    }

    @Test
    public void testGuessesNeeded() {

        System.out.println("Starting testGuessesNeeded. If this method never finishes, " +
                "check your code. Make sure your loop is working correctly.");
        
        Question_4_Random_Number_Guessing_Game q4 = new Question_4_Random_Number_Guessing_Game();

        // Mock random number

        int max = 10, expect = 6;

        q4.rnd = createNiceMock(Random.class);

        // Any time this method is called, return the same value
        expect( q4.rnd.nextInt(max) ).andReturn(expect).anyTimes();

        EasyMock.replay(q4.rnd);

        // Mock user input.

        // User guesses 3 times
        mockStatic(InputUtils.class);
        expect(InputUtils.intInput(anyString()))
                .andReturn(4)
                .andReturn(10)
                .andReturn(7);   //correct

        PowerMock.replay(InputUtils.class);

        int guesses = q4.play();

        assertEquals(3, guesses);


        // User is correct the first guess.
        PowerMock.reset(InputUtils.class);
        expect(InputUtils.intInput(anyString()))
                .andReturn(7);   //correct
        PowerMock.replay(InputUtils.class);

        guesses = q4.play();

        assertEquals(1, guesses);


    }

}