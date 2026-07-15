# Day 06 - While Loop, Do-While Loop, Break and Continue

## Difference Between for Loop and while Loop

for Loop:

Used when we already know how many times the loop should run.

Example:

Print numbers from 1 to 100.

---

while Loop:

Used when we do not know exactly how many times the loop should run.

Example:

Keep drinking water until the bottle becomes empty.

The loop continues until the condition becomes false.

## Why Is i++ Important?

i++ increases the value of i by 1 after each iteration.

Without i++, the condition may never become false.

Example:

int i = 1;

while(i <= 5)
{
    System.out.println(i);
}

Output:

1
1
1
1
1
...

This is called an Infinite Loop because it never stops.

## Infinite Loop

An infinite loop is a loop that never ends because its condition always remains true.

Example:

int i = 1;

while(i <= 5)
{
    System.out.println(i);
}

Reason:

The value of i never changes because i++ is missing.

Output:

1
1
1
1
1
...

The loop continues forever.

## Difference Between while and do-while

while Loop:

The condition is checked before executing the loop body.

If the condition is false, the loop will not execute even once.

---

do-while Loop:

The loop body executes first and then the condition is checked.

Therefore, a do-while loop executes at least one time, even if the condition is false.

## do-while Loop

Syntax:

do
{
    // code
}
while(condition);

A do-while loop executes the code first and checks the condition afterwards.

Therefore, it always runs at least one time.

Example:

int i = 10;

do
{
    System.out.println(i);
}
while(i <= 5);

Output:

10

## break Statement

The break statement is used to immediately stop a loop.

When Java encounters break:

- The loop terminates
- Remaining iterations are skipped
- Execution continues after the loop

Example:

for(int i = 1; i <= 10; i++)
{
    if(i == 5)
    {
        break;
    }

    System.out.println(i);
}

Output:

1
2
3
4

