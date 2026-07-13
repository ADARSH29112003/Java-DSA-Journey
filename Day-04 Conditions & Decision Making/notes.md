# Day 04 - Conditions

## What is COnditions?
-> A conditions is a statement that can be either true or false.

Example:

-> age>=18
-> marks > 90
-> passwordcorrect == true

Java uses conditions to make decision.

without conditions, programs execute every line.

with conditions, programs can choose different actions based on different situations.

## if Statement

The if statement is used to execute code only when a condition is true.

Syntax:

if(condition)
{
    // code
}

Example:

int age = 23;

if(age >= 18)
{
    System.out.println("You can vote");
}

Output:

You can vote

The code inside the if block runs only when the condition is true.

## Purpose of if Statement

The if statement is used to execute a block of code only when a condition is true.

If the condition is false, the code inside the if block is skipped.

## Important Rule of if Statement

If condition is true:
→ Java executes the code inside the if block.

If condition is false:
→ Java skips the code inside the if block.

Example:

int score = 50;

if(score >= 60)
{
    System.out.println("Passed");
}

Output:

Nothing

Reason:

50 >= 60 is false, so Java skips the if block.

## Difference Between if and if-else

if Statement:

Executes code only when the condition is true.

If the condition is false, Java skips the block.

---

if-else Statement:

Provides two possible paths.

If the condition is true:
→ Execute the if block

If the condition is false:
→ Execute the else block

## Nested if

A nested if means an if statement inside another if statement.

Syntax:

if(condition1)
{
    if(condition2)
    {
        // code
    }
}

Both conditions must be true for the code to execute.

Example:

if(age >= 18)
{
    if(hasID)
    {
        System.out.println("Entry Allowed");
    }
}