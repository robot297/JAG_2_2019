package week_2;

/**
 *
 Write a loop that adds up all of the integer numbers between 1 and 100,
 and displays the answer.
 
 Your loop should be in the addNumbers method. Use the `from` and `to`
 parameters in your code.
 
 Tip: 5050 is the right answer.
 
 Your method should work for any to and from numbers, not just 1 and 100.
 Make sure you use the method's parameters.
 
 If the method is called with a smaller `to` value than the `from` value,
 return the `from` value. For example, the following method call should return 100.
 
 `addNumbers(100, 1)`
 
 If the method is called with the same `from` and `to` values, return the
 `from` value. So the following method call should return 100.
 
 `addNumbers(100, 100)`


 */
public class Question_1_Add_Numbers_1_To_100 {

    public static void main(String[] args) {
    
        // You don't need to modify this main method.
    
        int start = 1;
        int end = 100;
        int result = addNumbers(start, end);
        System.out.println(String.format("The sum of the numbers %s to %s is %s", start, end, result));

    }

    public static int addNumbers(int from, int to) {

        // TODO write your loop here, and replace this return statement with your result.
        // It should add up all the numbers between the from and to variables,
        // including the values in the to and from variables
        // For example, if from = 5 and to = 7, your code should calculate 5 + 6 + 7 = 18
        
        // If the from number is larger than the to value, return the from value.
        // For example, if from = 7 and to = 5, return 7.
        
        // If the from and to numbers are the same, then return the from number.
        // For example, if from = 8 and to = 8, return 8
        
        return 0;

    }

}
