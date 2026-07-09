# Day - 03 -> Input and Output

## What is Input?
=> Input is the data provided by the user to a program.
Flow: User -> Program

Examples:

- Name
- Age
- Height
- Marks

Example: 
Enter your age: 23

Here, 23 is the input

## What is Output?

-> Output is the information displayed by the program to the user.

FLow: Program -> User

Example: Your age is 23

Here, "Your age is 23" is the output

## Real - life analogy

Input: Giving an order to a resturant
Output: Receiving your food
The order is Input
The food is Output


## What is scanner?
-> Scanner is the Java Class used to take input from the keyboard. Think of Scanner as a collector

FLow: User -> keyboard -> Scanner -> Java Program

Scanner takes the data entered by the user and passes it to the Java program

## Importing Scanner?

Code: import java.util.Scanner;
Meaning: This tells java that we want to use the Scanner class. Without importing scanner, Java will show an error when we try to create a scanner object.

## Creating a Scanner object?

Code: Scanner input = new Scanner (System.in);
Meaning: Create a scanner named "input" that reads data from the keyborad
Breakdown: 
Scanner 
-> Data Types
input
-> variable name
new 
-> Create a new object 
System.in
-> Keyboard input

## Integer Input

Method: 
nextInt()

Example: int age = input.nextInt();

Used for whole numbers.

Examples:
18
23
100

## String Input
Method: nextLine()

Example: string name = input.nextLine();

Used for text.

Examples:
Adarsh 
Rahul
Shreya

## Double Input
Method: nextdouble()

Example: double height = input.nextdouble();

Used for decimal values:

1.82
5.75
10.5

## Boolean Input
Method: nextBoolean()

Example: boolean isstudent = input.nextBoolean();

Used for:
True
False

## String Input
-> String are used to store text.

Examples:

-> Adarsh
-> Rahul
-> Hello World

Scanner Output:

-> input.nextLine();

Example:

=> String name = input.nextLine();

****This takes text input from the user and stores it in a string variable.