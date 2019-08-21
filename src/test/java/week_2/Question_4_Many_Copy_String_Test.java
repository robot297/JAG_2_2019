package week_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static week_2.Question_4_Many_Copy_String.multiplyString;


/**
 * Created by clara on 11/2/17.
 */

public class Question_4_Many_Copy_String_Test {
    
    @Test(timeout=3000)
    public void multiplyStringTest() {
    
        String testIn = "cat";
        int[] inM = { 1, 5, 8, 0, -1, -100 };
        String[] out = {"cat", "catcatcatcatcat", "catcatcatcatcatcatcatcat", "", "", ""};
    
        for (int s = 0; s < inM.length ; s++) {
        
            int inMult = inM[s];
            String outSt = out[s];
        
            String msg = String.format("When calling multiplyString method with '%s', and %d repeats, it should return '%s'",
                    testIn, inMult, outSt);
                    
            assertEquals(msg, outSt, multiplyString(testIn, inMult) );
        
        }
    }
    
}