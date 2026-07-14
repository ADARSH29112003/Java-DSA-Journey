## 1. What is a Loop?

A loop is a programming structure used to execute the same block of code multiple times until a condition becomes false.

---

## 2. Why Do We Use Loops?

Loops are used to reduce repetitive code and save time.

Instead of writing the same statement multiple times, a loop can execute it automatically.

Example:

Without Loop:

System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");

With Loop:

for(int i = 1; i <= 3; i++)
{
    System.out.println("Hello");
}

---

## 3. What Are the Three Parts of a for Loop?

Syntax:

for(initialization; condition; update)

Example:

for(int i = 1; i <= 5; i++)

Initialization:
int i = 1

Condition:
i <= 5

Update:
i++

---

## 4. What Does i++ Mean?

i++ increases the value of a variable by 1.

Example:

i = 1

After:

i++

Value becomes:

i = 2

It is commonly used in loops to move to the next iteration.

---

## 5. Predict the Output

for(int i = 1; i <= 3; i++)
{
    System.out.println("Java");
}

Output:

Java
Java
Java

Reason:

The loop runs 3 times and prints "Java" during each iteration.

---

## 6. Predict the Output

for(int i = 2; i <= 6; i++)
{
    System.out.println(i);
}

Output:

2
3
4
5
6

Reason:

The loop starts from 2 and continues until 6.

---

## 7. How Do We Identify an Even Number?

An even number is completely divisible by 2.

Condition:

number % 2 == 0

Examples:

2 % 2 = 0
4 % 2 = 0
6 % 2 = 0

Since the remainder is 0, these numbers are even.

---

## 8. How Do We Identify an Odd Number?

An odd number is not completely divisible by 2.

Condition:

number % 2 != 0

Examples:

1 % 2 = 1
3 % 2 = 1
5 % 2 = 1

Since the remainder is not 0, these numbers are odd.

---

## 9. Why Is a Loop Better Than Writing Multiple Print Statements?

Loops make code:

- Shorter
- Cleaner
- Easier to maintain
- More efficient

Example:

Instead of writing:

System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");

We can write:

for(int i = 1; i <= 5; i++)
{
    System.out.println("Hello");
}

This produces the same output with less code.