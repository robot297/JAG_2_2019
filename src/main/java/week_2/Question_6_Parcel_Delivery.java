package week_2;

import static input.InputUtils.doubleInput;

/**
 *
 * A parcel delivery company charges the following rates to ship a parcel.

 •	Up to 10 pounds: $2.15 per pound
 •	Up to 20 pounds: $1.55 per pound
 •	Up to 30 pounds: $1.15 per pound

 The shipping company does not ship parcels that weigh over 30 pounds.

 So, a parcel that weighs 17 pounds will cost $1.55 x 17 = $26.35.

 Write a program that asks the user for the weight of a parcel and displays whether it can be shipped, and what it will cost.

 Optional extra: the most obvious solution to this problem uses if statements for the price bands. Can you think of a different way?  Hint – loops and arrays of price and max weights for price?

 */
public class Question_6_Parcel_Delivery {

    public double MAX_WEIGHT = 30;   // Use this in the canShip method

    public static void main(String[] args) {

        // Don't modify the code in this method.

        Question_6_Parcel_Delivery delivery = new Question_6_Parcel_Delivery();

        double weight = doubleInput("Enter weight of parcel");

        boolean canShip = delivery.canShip(weight);

        if (canShip) {
            double price = delivery.calculatePrice(weight);
            System.out.println(String.format("It will cost %.2f to send your %.2f pound parcel", price, weight));
        }


    }

    public boolean canShip(double weight) {
        // TODO return false if parcel weighs 0 or less
        // TODO return false if parcel weighs more than MAX_WEIGHT. Use the MAX_WEIGHT variable in this code

        // TODO otherwise, the parcel is more than 0 and less than or equal to MAX_WEIGHT. Return true.

        return false;  // Replace this with your code
    }


    public double calculatePrice(double weight) {

        // TODO assume parcel is a valid weight. Figure out price to ship this parcel.

        return 0;   //Replace this with your calculated price

    }


}
