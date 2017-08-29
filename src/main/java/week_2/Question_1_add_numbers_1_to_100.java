package week_2;

/**
 *
 * Write a loop that adds up all of the integer numbers between 1 and 100,
 including 1 and 100.
 and displays the answer.

 Tip: 5050 is the right answer

 */
public class Question_1_add_numbers_1_to_100 {

    public static void main(String[] args) {

        int start = 1;
        int end = 100;
        int result = addNumbers(start, end);
        System.out.println(String.format("The sum of the numbers %s to %s is %s", start, end, result));

    }

    public static int addNumbers(int from, int to) {

        // TODO write your loop here, and replace this return statement with your result.
        // It should add up all the numbers between the from and to variables,
        // including the values in to and from.
        // For example, if from = 5 and to = 7, your code should calculate 5 + 6 + 7 = 18
        return 0;

    }

}
