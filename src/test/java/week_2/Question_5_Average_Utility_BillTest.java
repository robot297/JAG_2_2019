package week_2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Question_5_Average_Utility_BillTest {

    double delta = 0.00001;
    
    private InputStream stdIn;
    
    @Before
    public void mockSystemIn() {
        stdIn = System.in;
    }
    
    @After
    public void resetSystemIn() {
        System.setIn(stdIn);
    }
    
    @Test(timeout=3000)
    public void testGetYearBills() throws Exception {

        double[] exampleBills = {3.0, 4.0, 5.0, 6.0, 1.0, 2.0, 3.0, 6.0, 7.0, 3.0, 6.0, 7.0};
        String input = "";
        for (double bill : exampleBills) {
            input += bill;
            input += "\n";
        }
        
//        String[] billString = (String[])Arrays.stream(exampleBills).map(b -> b.toString()).collect(Collectors.toList()).toArray();
       // String billAmounts = String.join("\n", billString);
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Question_5_Average_Utility_Bill q5 = new Question_5_Average_Utility_Bill();
        
        double[] bills = q5.getYearBills();

        assertArrayEquals("Make you ask the user for 12 bill amounts, and save each value in a 12-element array. Return this array.", exampleBills, bills, delta);

    }
    
    
    @Test(timeout=3000)
    public void testAverageBillAmount() throws Exception {

        Question_5_Average_Utility_Bill q5 = new Question_5_Average_Utility_Bill();

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

        Question_5_Average_Utility_Bill q5 = new Question_5_Average_Utility_Bill();

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