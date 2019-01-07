package week_2;

import input.InputUtils;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Random;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;
import static org.powermock.api.easymock.PowerMock.createNiceMock;


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
        
        int maxVal = 42;
        int expectedVal = 6;   //This is the value that rnd.nextInt will return
        
        q4.rnd = createNiceMock(Random.class);
        expect(q4.rnd.nextInt(maxVal)).andReturn(expectedVal);
        EasyMock.replay(q4.rnd);

        int actualResult = q4.generateSecretNumber(maxVal);
        
        assertEquals("Generate a random number using the random number generator in the program", expectedVal, actualResult);
        
    }

}