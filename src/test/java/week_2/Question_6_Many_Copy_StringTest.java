package week_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static week_2.Question_6_Many_Copy_String.multiplyString;


/**
 * Created by clara on 11/2/17.
 */

public class Question_6_Many_Copy_StringTest {
    
    @Test(timeout=3000)
    public void multiplyStringTest() throws Exception {
    
        String testIn = "cat";
        int[] inM = { 1, 5, 8, 0 };
        String[] out = {"cat", "catcatcatcatcat", "catcatcatcatcatcatcatcat", ""};
    
        for (int s = 0; s < inM.length ; s++) {
        
            int inMult = inM[s];
            String outSt = out[s];
        
            assertEquals( String.format("When calling () method with '%s', and %d copies, it should return '%s'",
                    testIn, inMult, outSt), outSt, multiplyString(testIn, inMult) );
        
        }
    }
    
}