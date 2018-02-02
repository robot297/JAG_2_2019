package week_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static week_2.Question_1_Add_Numbers_1_To_100.*;

public class Question_1_Add_Numbers_1_To_100Test {
    
    @Test(timeout=3000)
    public void testAddNumbersSmallToLarger() {
        
        assertEquals("Adding the numbers between 1 and 100 should sum to 5050", 5050, addNumbers(1, 100));
        assertEquals("Adding the numbers between 6 and 10 should sum to 40", 40, addNumbers(6, 10));
        
    }
    
    
    @Test(timeout=3000)
    public void testAddNumbersLargeToSmall() {
        
        // The method should still work if the order of the parameters is reversed, but will return the first parameter
        
        assertEquals("Adding the numbers between 10 and 6 (from is larger than to) should return 10", 10, addNumbers(10, 6));
        assertEquals("Adding the numbers between 100 and 1 (from is larger than to) should sum to 100", 100, addNumbers(100, 1));
        
    }
    
    
    @Test(timeout=3000)
    public void testAddNumbersBothNumbersSame() {
   
        // If the parameters are the same, return the value of either parameter
    
        assertEquals("Adding the numbers between 10 and 10 should sum to 10", 10, addNumbers(10, 10));
        assertEquals("Adding the numbers between 100 and 100 should sum to 100", 100, addNumbers(100, 100));
        
    }
    
}