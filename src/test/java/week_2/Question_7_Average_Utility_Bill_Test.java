package week_2;


import input.InputUtils;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Pattern;

import static org.easymock.EasyMock.anyString;
import static org.easymock.EasyMock.expect;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.powermock.api.easymock.PowerMock.mockStatic;
import static org.powermock.api.easymock.PowerMock.replay;


@RunWith(PowerMockRunner.class)
@PrepareForTest(InputUtils.class)
public class Question_7_Average_Utility_Bill_Test {

    double delta = 0.00001;
    
    
    @Test(timeout=3000)
    public void testGetYearBills() throws Exception {

        double[] exampleBills = {3.0, 4.0, 5.0, 6.0, 1.0, 2.0, 3.0, 6.0, 7.0, 3.0, 6.0, 7.0};

        Question_7_Average_Utility_Bill q5 = new Question_7_Average_Utility_Bill();

        mockStatic(InputUtils.class);

        for (double returnVal : exampleBills) {
            expect(InputUtils.doubleInput(anyString())).andReturn(returnVal);   // "Record" expected behavior
        }

        replay(InputUtils.class);   // "Play" or "activate" the expected behavior.

        double[] bills = q5.getYearBills();

        assertArrayEquals("Make you ask the user for 12 bill amounts, and save each value in a 12-element array. Return this array.", exampleBills, bills, delta);

    }
    
    
    @Test(timeout=3000)
    public void testAverageBillAmount() throws Exception {

        Question_7_Average_Utility_Bill q5 = new Question_7_Average_Utility_Bill();

        double[] exampleBills = {4.1, 5.1, 6.1};
        double sum = 4.1 + 5.1 + 6.1;
        assertEquals("Check your math in the addition and average calculation. This method should work with any length array.", sum/exampleBills.length,  q5.averageBillAmount(exampleBills), delta);

    }
    
    @Test(timeout=3000)
    public void testPrintBillTable() throws Exception {

        // Replace standard out to be able to test what System.out.println/printf is called with

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        double[] exampleBills = { 2 , 3 , 4 };

        Question_7_Average_Utility_Bill q5 = new Question_7_Average_Utility_Bill();

        q5.months = new String[]{ "jan", "feb", "mar" } ;

        q5.printBillTable(exampleBills);

        String output = out.toString();

        // Matching newlines with regex is a bit of a hassle. Get rid of the newline chars
        output = output.replace("\n", " ");    // Mac/Linux have \n for a newline char
        output = output.replace("\r", " ");   // For Windows PCs, which use \r\n for a newline.
        
        String pattern = ".*jan.*2.*feb.*3.*mar.*4.*";

        assertTrue("If you are sure your table is right but this method fails, please tell Clara - the test might not be reading your table correctly.", Pattern.matches(pattern, output));

    }
}