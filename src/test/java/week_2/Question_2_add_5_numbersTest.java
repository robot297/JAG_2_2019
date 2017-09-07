package week_2;

import input.InputUtils;
import junit.framework.TestCase;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Arrays;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.assertArrayEquals;
import static org.powermock.api.easymock.PowerMock.*;
//import static week_2.Question_2_add_5_numbers.getNumbers;


@RunWith(PowerMockRunner.class)
@PrepareForTest({InputUtils.class, Question_2_add_5_numbers.class})

public class Question_2_add_5_numbersTest extends TestCase {
    
    @Test
    public void testGetNumbers() throws Exception {

        // 5 example numbers.
        // For this data, the total is 71.5, and the average is 14.3
        double[] exampleInput = { 6.5, 10, 40, 3, 12 };
        double[] expectedResult = { 71.5, 14.3 };
        double delta = 0;  // how close do doubles have to be to be considered the same?

        // Mock the InputUtils class to provide our pre-defined numbers
        mockStatic(InputUtils.class);

        for (double d : exampleInput) {
            expect(InputUtils.doubleInput(anyString())).andReturn(d);   // Prepare sequence of return values
        }

        PowerMock.replay(InputUtils.class);   // activate input mock


        // Call our method
        Question_2_add_5_numbers q2 = new Question_2_add_5_numbers();
        double[] result = q2.getNumbers();

        // Assert that it returns the expected value
        assertArrayEquals("With the numbers " + Arrays.toString(exampleInput) +
                " the total and average should be " + Arrays.toString(expectedResult) +
                "\nYour code returned " + Arrays.toString(result), result, expectedResult, delta);


    }
}