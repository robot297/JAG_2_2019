package week_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Question_6_Parcel_DeliveryTest {
    
    @Test
    public void testCanShip() throws Exception {

        Question_6_Parcel_Delivery delivery = new Question_6_Parcel_Delivery();

        // Some valid weights
        assertTrue(delivery.canShip(0.1));
        assertTrue(delivery.canShip(10));
        assertTrue(delivery.canShip(30));


        assertFalse("-1 should not a valid weight for a parcel", delivery.canShip(-1));
        assertFalse("0 should not a valid weight for a parcel", delivery.canShip(0));
        assertFalse("The parcel's weight should not exceed MAX_WEIGHT", delivery.canShip(delivery.MAX_WEIGHT + 1));

        // Checking if the code uses the MAX_WEIGHT variable
        delivery.MAX_WEIGHT = 10;
        assertFalse("The parcel's weight should not exceed MAX_WEIGHT", delivery.canShip(delivery.MAX_WEIGHT + 5));

    }

    @Test
    public void testCalculatePrice() throws Exception {

        /*	Up to 10 pounds: $2.15 per pound
        	Up to 20 pounds: $1.55 per pound
        	Up to 30 pounds: $1.15 per pound
        */

        Question_6_Parcel_Delivery delivery = new Question_6_Parcel_Delivery();

        double delta = 0.00001; // Numbers must be within this value of each other to be considered the same

        assertEquals("A 5 pound parcel should cost " + (5 * 2.15),  5 * 2.15, delivery.calculatePrice(5), delta);
        assertEquals("A 10 pound parcel should cost " + (10 * 2.15), 10 * 2.15, delivery.calculatePrice(10), delta);
        assertEquals("A 14 pound parcel should cost " + (14 * 1.55),  14 * 1.55, delivery.calculatePrice(14), delta);
        assertEquals("A 20 pound parcel should cost " + (20 * 1.55),  20 * 1.55, delivery.calculatePrice(20), delta);
        assertEquals("A 22 pound parcel should cost " + (22 * 1.15),  22 * 1.15, delivery.calculatePrice(22), delta);
        assertEquals("A 30 pound parcel should cost " + (30 * 1.15),  30 * 1.15, delivery.calculatePrice(30), delta);


    }
}