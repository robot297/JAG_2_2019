package week_2;

import junit.framework.TestCase;

public class Question_9_cellphone_storageTest extends TestCase {

    public void testCalculateTimeToFillPhone() throws Exception {

        Question_9_cellphone_storage q10 = new Question_9_cellphone_storage();
        assertEquals(4714, q10.calculateTimeToFillPhone(5000, 0.5, 2, 0.1, 1000));
        assertEquals(225, q10.calculateTimeToFillPhone(5000, 3, 2.5, 3, 1000));

    }
}