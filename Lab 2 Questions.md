# Lab 2 


### Question 1 Add all integer numbers in a range

Write a loop that adds up all of the integer numbers between 1 and 100, and displays the answer.

Your loop should be in the addNumbers method. Use the `from` and `to` parameters in your code. 
 
Tip: 5050 is the right answer.

Your method should work for any to and from numbers, not just 1 and 100. Make sure you use the method's parameters.

If the method is called with a smaller `to` value than the `from` value, return the `from` value. For example, the following method call should return 100.

`addNumbers(100, 1)` 


If the method is called with the same `from` and `to` values, return the `from` value. So the following method call should return 100. 

`addNumbers(100, 100)`


### Question 2 Add 5 numbers
    
Write your code in the `getNumbersAndAnalyze` method.

Write a loop that asks the user to enter 5 numbers. The user should enter the numbers, one by one.

Use the `doubleInput("enter a number")` method.

Once the user has entered all the numbers, calculate the total of all the numbers.


### Question 3 Debugger practice

Add a breakpoint to the start of one of your programs. Debug it, and then use the debugger to step through your program, and inspect the value of the variables.

* How do you add a breakpoint? How can you remove a breakpoint?
* Can you add more than one breakpoint?
* How do you activate and deactivate breakpoints?
* How do you move through your code one line at a time?
* How do you see the value of a variable?
* What does clicking on the triangle next to a variable on the variables pane do? (Such as the arrow next to names in the screenshot below)


### Question 4 Random number guessing game

Your program should generate a random number between 0 and 9, and challenge the user to guess the number.

Write a loop that asks the user to guess a number that the computer is thinking of. Print a success message if they guess correctly.

If the user does not guess correctly, tell the user that they need to guess
higher, or lower, and ask the user to try again.

The user should be able to have as many guesses as they need.

Once the user guesses correctly, tell the user how many guesses they needed to get the right number.


### Question 5 Average utility bills

Customers of a heating utility company have much larger bills in the cold winter than in the summer.
The utility company allows customers to spread the cost of bills through the year by charging them an average payment every month.
 
The utility company averages all of the last year's bills, and uses that to estimate the average payment for next year.
 
Ask the user for each month's bill for last year. 
Store this data in an array.
Store January's bill in element 0, February's in element 1...
 
Then, add up all of the bills and figure out, and display the average.
 
Also, display the user's data in a table of months and bill amount, so they can review it for accuracy.
 
Tip: use the `months` array provided, with the names of the months to help ask for data/display data.


### Question 6 Many Copies of a String

 * Finish the multiplyString method to create a String from many copies of itself.
 * The user will decide how many copies to make.
 *
If the method is given the String "cat" and n = 3 copies, it will return "catcatcat".
If the method is given the String "Hello" and n = 5 copies, it will return "HelloHelloHelloHelloHello".
 
If the method is given the String "Hello" and n = 1 copies, it will return "Hello".
If the method is given the String "Hello" and n = 0 copies, it will return "". (An empty String)
If the method is given the String "Hello" and n = -1 copies, or any negative number it will return "". (An empty String)
 

### Question 7 Square of Characters

 
Write a program that displays a square of characters of any size, between 1 and 100 characters.
 
The user should be able to enter a size, a character, and your program will use loops to display a square.
 
So, if the user enters 4, and the character "%" your program will display

```
 %%%%
 %%%%
 %%%%
 %%%%
```


### Question 8 Does a String contain all the characters in a set?

Finish this program to test if a String contains all of the
punctuation characters from the number keys on a standard US keyboard:

```
!@#$%^&*()
```
So, the String `abc!@#$%^&*()def` contains all the characters.
The String `)(*&^%$#@!` contains all the characters.
The String `a)(b*&c^%d$#e@!` contains all the characters.
 
The String `abc$*^def` does not contain all of the characters.
The String `cat` does not contain all of the characters.


In your program, finish the method that tests if a String contains all the characters in another String. Make sure this method would work with any two input Strings.
 
 
Your code should NOT use 10 if statements!


### Question 9 Cellphone Storage

A cellphone is running 3 apps, each of which syncs and download data from a different server.

 •	App A syncs and downloads data every hour, and downloads 0.5KB each time
 •	App B syncs and downloads daily, and downloads 2KB every time
 •	App C, when installed, is 1MB in size  (assume this is equal to 1000KB). This app syncs and
       downloads every 4 hours, and every time it syncs it downloads 1% of its current size.
       The new data it downloads count towards the app's size, so you'll need to keep track of
       the current size of the app.

With all apps installed, the phone has 5MB (or 5000KB) of free space.
When the phone starts, each app syncs and downloads, and then repeats to their own schedule.

With all 3 apps running continuously, how long, in hours, will it be before the phone runs out of space?

Assume the phone is running continuously and nothing else is using space on the phone.

Assume that 1KB = 1000 bytes and 1MB = 1000,000 bytes.

Hint 1: the modulo operator is helpful. An expression like  `( number % 4 == 0 )` is true if number divides evenly by 4.
Hint 2: the answer is several hundred hours.
Hint 3: This problem is a little trickier than the other ones, but it can be done :)