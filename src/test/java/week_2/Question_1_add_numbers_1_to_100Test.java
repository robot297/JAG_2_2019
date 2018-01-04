package week_2;

import junit.framework.TestCase;
import static week_2.Question_1_Add_Numbers_1_To_100.*;

public class Question_1_add_numbers_1_to_100Test extends TestCase {

    public void testAddNumbers() {

        assertEquals("Adding the numbers between 1 - 100 should be 5050", 5050, addNumbers(1, 100));
        assertEquals("Adding the numbers between 6 - 10 should be 40", 40, addNumbers(6, 10));


    }
    
}