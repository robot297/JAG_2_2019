package week_2;

/**
 *
 * //fixme
 *
 * Add a breakpoint to the start of one of your programs. Debug it, and then use the debugger to step through your program, and inspect the value of the variables.

 How do you add a breakpoint? How can you remove a breakpoint?

 Can you add more than one breakpoint?

 How do you activate and deactivate breakpoints?

 How do you move through your code one line at a time?

 How do you see the value of a variable?

 What does clicking on the triangle next to a variable on the variables pane do? (Such as the arrow next to names in the screenshot below)

 */
public class Question_3_debugger {

    // TODO In the methods that follow, make sure you can do the debugging tasks.
    // TODO Write a comment answering the question
    // TODO Change the 'return false' statements to 'return true' as you use the debugger's tools.
    // To practice, you can try examining this program in the debugging.

    public static void main(String[] args) {

        // Some test variables and method calls to examine in the debugger.
        int number = 5;
        number = number + 2;
        String text = "Hello World";

        double result = halfThisNumber(number);
        System.out.println(result);
    }

    public static double halfThisNumber(int number) {
        return number / 2.0;
    }



    public boolean canAddAndRemoveBreakPoint() {

        // TODO how do you add a breakpoint?
        // TODO how do you remove a breakpoint?

        return false;

    }


    public boolean canStartDebugger() {

        // TODO How do you start the debugger?

        return false;
    }


    public boolean canAddManyBreakpoints() {

        // TODO     Can you add more than one breakpoint?

        return false;
    }


    public boolean canStepThroughCode() {
        // TODO     How do you move through your code one line at a time?

        return false;
    }

    public boolean canSeeValueOfVariables() {
        // TODO     How do you see the value of a variable?

        return false;
    }

    public boolean canSeeValuesOfVariablesInStructures() {

        // TODO   What does clicking on the triangle next to a variable on the variables pane do?

        return false;
    }


}
