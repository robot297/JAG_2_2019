package week_2;

/**
    Write a loop that asks the user to enter 5 numbers.
    The user should enter the numbers, one by one.
    Use the doubleInput("enter a number") method.
    Once the user has entered all the numbers,
    calculate the total and the average value.
*/


public class Question_2_Add_5_Numbers {

    public static void main(String[] args) {
    
        // You don't need to modify the main method.
    
        Question_2_Add_5_Numbers adder = new Question_2_Add_5_Numbers();
        double[] results = adder.getNumbers();
        System.out.println("The total is " + results[0]);
        System.out.println("The average is " + results[1]);

    }


    public double[] getNumbers() {

        // TODO Ask user for 5 numbers, one by one
    
        double total = 0;  // TODO Keep the total variable. Replace 0 with your result.
        double average = 0;  // TODO Keep the average variable. Replace 0 with your result.

        // Write your code here...
    
        // Calculate total and average and save in the total and average variables.
    
    
        // Don't modify this line
        return new double[]{ total, average };
    }

}
