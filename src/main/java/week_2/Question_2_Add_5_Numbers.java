package week_2;

import static input.InputUtils.doubleInput;


/**
    Write a loop that asks the user to enter 5 numbers.
    The user should enter the numbers, one by one.
 
    Use the doubleInput("enter a number") method.
 
    Once the user has entered all the numbers,
    calculate the total of all the numbers.
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
        // Use the doubleInput method.
        // Add up all numbers as the user enters them
        
        return 0;   // TODO Replace with your code
    }

}
