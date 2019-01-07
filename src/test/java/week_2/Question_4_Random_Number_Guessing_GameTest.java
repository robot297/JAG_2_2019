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
import static org.powermock.api.easymock.PowerMock.createNiceMock;
import static org.powermock.api.easymock.PowerMock.mockStatic;


@RunWith(PowerMockRunner.class)
@PrepareForTest({InputUtils.class, Random.class})
public class Question_4_Random_Number_Guessing_GameTest {

    @Test(timeout=3000)
    public void testCorrect() throws Exception {

        Question_4_Random_Number_Guessing_Game q4 = new Question_4_Random_Number_Guessing_Game();

        q4.CORRECT = "c-o-r-r-e-c-t";
        q4.LOW = "l-o-w";
        q4.HIGH = "h-i-g-h";   // Replace the CORRECT, HIGH, LOW to verify that these variables are being used

        assertEquals("Return the CORRECT String if secret is the same as guess", q4.CORRECT, q4.checkGuess(3, 3));
        assertEquals("Return the CORRECT String if secret is the same as guess", q4.CORRECT, q4.checkGuess(10, 10));

        assertEquals("Return the HIGH String if secret is higher than guess", q4.HIGH, q4.checkGuess(4, 10));
        assertEquals("Return the LOW String if secret is lower than guess", q4.LOW, q4.checkGuess(10, 4));

    }

    @Test(timeout=3000)
    public void testGenerateSecretNumber() throws Exception {

        // Mock the random number generator and verify the
        // method returns the mock's output.

        Question_4_Random_Number_Guessing_Game q4 = new Question_4_Random_Number_Guessing_Game();

        // A random number between 1 and 10, inclusive. So 10 possible numbers.
        int min = 1, max = 10, possibleVals = (max - min) + 1;
        int nextIntVal = 6;   //This is the value that rnd.nextInt will return

        // For min = 1, max = 10, force the rnd generator to generate 6 and then function should return 7

        q4.rnd = createNiceMock(Random.class);
        // nextInt(possibleVals) will return 6
        expect(q4.rnd.nextInt(possibleVals)).andReturn(nextIntVal);
        EasyMock.replay(q4.rnd);

        int expectedResult = nextIntVal + min;
        assertEquals("Ensure you use the min and max arguments", expectedResult, q4.generateSecretNumber(max));

        // Verify method is using the arguments correctly

        min = 20; max = 44; possibleVals = (max - min) + 1;
        nextIntVal = 32;

        q4.rnd = createNiceMock(Random.class);
        expect(q4.rnd.nextInt(possibleVals)).andReturn(nextIntVal);
        EasyMock.replay(q4.rnd);

        assertEquals("Ensure you use the min and max arguments", nextIntVal + min, q4.generateSecretNumber(max));

    }

}