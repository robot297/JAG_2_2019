package week_2;

import junit.framework.TestCase;

public class Question_8_cellphone_storageTest extends TestCase {

    public void testCalculateTimeToFillPhone() throws Exception {

        Question_8_Cellphone_Storage q10 = new Question_8_Cellphone_Storage();
        // 696, plus or minus a handful of hours. You might have the right logic but count the hours slightly differently.
        assertEquals("The answer should be about 696. If you are sure your logic is right, \nplease tell Clara that this test is failing.. ", 696, q10.calculateTimeToFillPhone(5000, 0.5, 2, 1, 1000), 30);
        
        // Another example: what if AppA downloads 3KB, AppB downloads 2.5KB, App 3 downloads 3% and starts at 4MB?
        assertEquals("Ensure you use the calculateTimeToFillPhone arguments. If you are sure your logic is right, \nplease tell Clara that this test is failing.", 108, q10.calculateTimeToFillPhone(5000, 3, 2.5, 3, 4000), 5);

        // Another example: what if AppA downloads 3KB, AppB downloads 2.5KB, App 3 downloads 3% and starts at 4MB?
        assertEquals("Ensure you use the calculateTimeToFillPhone arguments. If you are sure your logic is right, \nplease tell Clara that this test is failing.", 4718, q10.calculateTimeToFillPhone(5000, 0.5, 2, 0.1, 1000), 100);

    }
}