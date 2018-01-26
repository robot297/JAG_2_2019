package week_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static week_2.Question_9_Cellphone_Storage.calculateTimeToFillPhone;

public class Question_9_Cellphone_StorageTest {

    @Test(timeout=3000)
    public void testCalculateTimeToFillPhone() throws Exception {

        // 696, plus or minus a handful of hours. You might have the right logic but count the hours slightly differently.
        assertEquals("The answer should be about 696. If you are sure your logic is right, \nplease tell the instructor that this test is failing. ",
                696, calculateTimeToFillPhone(5000, 0.5, 2, 1, 1000), 30);
        
        // Another example: what if AppA downloads 3KB, AppB downloads 2.5KB, App 3 downloads 3% and starts at 4MB?
        assertEquals("What if AppA downloads 3KB, AppB downloads 2.5KB, App 3 downloads 3% and starts at 4MB?\n. " +
                        "Ensure you use the calculateTimeToFillPhone arguments. If you are sure your logic is right, " +
                        "\nplease tell the instructor that this test is failing.",
                108, calculateTimeToFillPhone(5000, 3, 2.5, 3, 4000), 5);

        // Another example: what if AppA downloads 3KB, AppB downloads 2.5KB, App 3 downloads 3% and starts at 4MB?
        assertEquals("What if AppA downloads 3KB, AppB downloads 2.5KB, App 3 downloads 3% and starts at 4MB?\n" +
                        "Ensure you use the calculateTimeToFillPhone arguments. If you are sure your logic is right, " +
                        "\nplease tell the instructor that this test is failing.",
                4718, calculateTimeToFillPhone(5000, 0.5, 2, 0.1, 1000), 100);

    }
}