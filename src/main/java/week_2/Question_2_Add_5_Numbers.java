package week_2;

import static input.InputUtils.doubleInput;


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
    
        Question_2_Add_5_Numbers q2 = new Question_2_Add_5_Numbers();
        double results = q2.getNumbersAndCalculateTotal();
        System.out.println("The total is " + results);

    }


    public double getNumbersAndCalculateTotal() {

        // TODO Ask user for 5 numbers, one by one
        double total = 0;  // TODO Keep the total variable. Replace 0 with your result.
        
        // Calculate total and save in the total variables. Use the doubleInput method.
        // Write your code here...

    
        // Don't modify this line
        return total;
    }

}
