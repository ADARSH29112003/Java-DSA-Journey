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

## Even Numbers

An even number is divisible by 2.

Condition:

number % 2 == 0

Examples:

2, 4, 6, 8, 10

Reason:

2 % 2 = 0
4 % 2 = 0
6 % 2 = 0

When the remainder is 0, the number is even.

for(int i = 1; i <= 10; i++)
{
    if(i % 2 == 0)
    {
        System.out.println(i);
    }
}

1 % 2 = 1 ❌

2 % 2 = 0 ✅ print 2

3 % 2 = 1 ❌

4 % 2 = 0 ✅ print 4

5 % 2 = 1 ❌

6 % 2 = 0 ✅ print 6

7 % 2 = 1 ❌

8 % 2 = 0 ✅ print 8

9 % 2 = 1 ❌

10 % 2 = 0 ✅ print 10

2
4
6
8
10

## Why Does i % 2 == 0 Find Even Numbers?

% gives the remainder after division.

Example:

4 % 2 = 0
6 % 2 = 0
8 % 2 = 0

Even numbers divide completely by 2, so their remainder is 0.

Then Java checks:

0 == 0

Result:

true

Therefore the number is even.

## Printing Even Numbers Using Loops

Example:

for(int i = 1; i <= 10; i++)
{
    if(i % 2 == 0)
    {
        System.out.println(i);
    }
}

Output:

2
4
6
8
10

Explanation:

The loop checks every number from 1 to 10.

If the number is divisible by 2, it is printed.

## Printing Odd Numbers Using Loops

Condition:

i % 2 != 0

Example:

for(int i = 1; i <= 10; i++)
{
    if(i % 2 != 0)
    {
        System.out.println(i);
    }
}

Output:

1
3
5
7
9

Explanation:

Odd numbers are not completely divisible by 2.

Their remainder is not equal to 0.