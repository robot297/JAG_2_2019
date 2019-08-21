# Lab 2 


### Question 1, print a range of numbers

Write a program that prints the numbers 1 to 10.
 
Your loop should be in the printNumbers method. Use the `from` and `to` parameters in your code.
 
Your method should work for any to and from numbers, not just 1 and 10.

Make sure you use the method's parameters.
 

### Question 2, tip amount calculator 

Write a program that prints suggested tip amounts for a food check in a restaurant.

The user will enter the amount of the check.

The program will print the amount of tip for various percentages.

It will print a table of suggested tip amounts from 10% to 30%, in 5% increments.

For example, if the user has a check of $30, the program will print

10% tip $3.00 total $33.00
15% tip $4.50 total $34.50
20% tip $6.00 total $36.00
25% tip $7.50 total $37.50
30% tip $9.00 total $39.00

Your program's output should look exactly as shown above.

### Question 3 while loop input validation


### Question 4 many copies of a String

Finish the multiplyString method to create a String from many copies of itself.
The user will decide how many copies to make.
 
If the method is given the String "cat" and n = 3 copies, it will return "catcatcat".
If the method is given the String "Hello" and n = 5 copies, it will return "HelloHelloHelloHelloHello".
 
If the method is given the String "Hello" and n = 1 copies, it will return "Hello".
If the method is given the String "Hello" and n = 0 copies, it will return "". (An empty String)
If the method is given the String "Hello" and n = -1 copies, or any negative number it will return "". (An empty String)
 

### Question 5 Nested Null Loop   (TODO)



### Question 6 filter array

Write a program that prints only the program file names from an array.

For this question, a program file is any file that ends with .py or .java or .cs

For example, if a filenames array = `{ "lab1.py", "assignment.docx", "music.mp3", "Website.cs", "Calculator.java" }`
Then the program should print

```
lab1.py
Website.cs
Calculator.java
```


### Question 7 remove bad data from an array


### Question 8, average utility bills

Customers of a heating utility company have much larger bills in the cold winter than in the summer.
The utility company allows customers to spread the cost of bills through the year by charging them an average payment every month.
 
The utility company averages all of the last year's bills, and uses that to estimate the average payment for next year.
 
Ask the user for each month's bill for last year. 
Store this data in an array.
Store January's bill in element 0, February's in element 1...
 
Then, add up all of the bills and figure out, and display the average.
 
Also, display the user's data in a table of months and bill amount, so they can review it for accuracy.
 
Tip: use the `months` array provided, with the names of the months to help ask for data/display data.
