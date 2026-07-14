# Day 05 - Loops

## What is a Loop?

A loop is used to execute the same block of code multiple times.

Without loops, we may have to write the same code again and again.

Loops help reduce code duplication and save time.

Example:

Print "Hello" 5 times.

Without loop:
5 print statements

With loop:

1 loop + 1 print statement

## Why Do We Need Loops?

Loops help us repeat the same task multiple times without writing duplicate code.

Benefits:

- Less code
- Easier maintenance
- Saves time
- Reduces mistakes

Real-life example:

Wake up
Go to college
Study
Sleep

These activities repeat every day, similar to how loops repeat tasks in programming.

## Parts of a for Loop

Syntax:

for(initialization; condition; update)
{
    // code
}

Example:

for(int i = 1; i <= 5; i++)
{
    System.out.println(i);
}

Explanation:

Initialization:
int i = 1

Condition:
i <= 5

Update:
i++

The loop runs while the condition is true.

## Tracing a Loop

To understand a loop:

1. Check the starting value.
2. Check the condition.
3. Execute the code.
4. Update the variable.
5. Repeat until the condition becomes false.

Example:

for(int i = 1; i <= 5; i++)
{
    System.out.println(i);
}

Output:

1
2
3
4
5