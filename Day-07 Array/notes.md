# Day 07 - Arrays in Java

## 1. What is an Array?

An Array is a collection of elements of the same data type stored in a continuous memory location.

Simple words:

Array ek container hai jisme hum ek hi data type ki multiple values store kar sakte hain.

Example:

```java
int[] marks = {85, 90, 78, 92, 88};
```

Yaha:

* Array Name = marks
* Data Type = int
* Total Elements = 5

---

# 2. Why do we need Arrays?

Before Arrays:

```java
int marks1 = 85;
int marks2 = 90;
int marks3 = 78;
int marks4 = 92;
int marks5 = 88;
```

Problems:

* Bahut saare variables create karne padte hain.
* Data manage karna difficult hota hai.
* Loops use nahi kar sakte efficiently.

With Array:

```java
int[] marks = {85,90,78,92,88};
```

Benefits:

* Multiple values ek hi variable mein store hoti hain.
* Data management easy hota hai.
* Loops ke through easily access kar sakte hain.
* DSA mein arrays sabse important data structures mein se ek hain.

---

# 3. Array Indexing

Array mein har element ka ek position number hota hai jise Index kehte hain.

Important:

Java arrays ka index 0 se start hota hai.

Example:

```
Index:

0    1    2    3    4

85   90   78   92   88
```

Access:

```java
marks[0]
```

Output:

```
85
```

```java
marks[2]
```

Output:

```
78
```

---

# 4. Creating Arrays in Java

## Method 1: Declaration + Memory Allocation

Syntax:

```java
dataType[] arrayName = new dataType[size];
```

Example:

```java
int[] numbers = new int[5];
```

Memory created:

```
Index:

0   1   2   3   4

0   0   0   0   0
```

Default value of int array is 0.

---

## Method 2: Direct Initialization

Syntax:

```java
dataType[] arrayName = {value1, value2, value3};
```

Example:

```java
int[] numbers = {10,20,30,40};
```

Memory:

```
Index:

0    1    2    3

10   20   30   40
```

---

# 5. Accessing Array Elements

Syntax:

```java
arrayName[index]
```

Example:

```java
int[] marks = {85,90,78};

System.out.println(marks[1]);
```

Output:

```
90
```

---

# 6. Updating Array Elements

Array ke elements ko change kar sakte hain.

Example:

Before:

```
85 90 78
```

Code:

```java
marks[1] = 95;
```

After:

```
85 95 78
```

---

# 7. Array Length

Array ke total elements count karne ke liye:

```java
arrayName.length
```

Example:

```java
int[] marks = {85,90,78,92,88};

System.out.println(marks.length);
```

Output:

```
5
```

Important:

`length` ek property hai.

Wrong:

```java
marks.length()
```

Correct:

```java
marks.length
```

---

# 8. Traversing / Looping Through Array

Array ke saare elements ko ek-ek karke access karna traversal kehlata hai.

Example:

```java
int[] marks = {85,90,78,92,88};

for(int i=0; i<marks.length; i++){

    System.out.println(marks[i]);

}
```

Output:

```
85
90
78
92
88
```

How loop works:

First iteration:

```
i = 0

marks[0]

85
```

Second iteration:

```
i = 1

marks[1]

90
```

Last iteration:

```
i = 4

marks[4]

88
```

---

# 9. Common Mistakes

## Mistake 1: Wrong Index

Example:

```java
int[] arr = {10,20,30};

System.out.println(arr[3]);
```

Error:

```
ArrayIndexOutOfBoundsException
```

Reason:

Available indexes:

```
0 1 2
```

---

## Mistake 2: Using length()

Wrong:

```java
arr.length()
```

Correct:

```java
arr.length
```

---

# 10. Important Interview Questions

## Q1. Array indexing Java mein kaha se start hoti hai?

Answer:

```
0 se
```

## Q2. Array ka size fixed hota hai?

Answer:

Yes.

Java arrays ka size creation ke time fix hota hai.

Example:

```java
new int[5]
```

Baad mein size change nahi kar sakte.

## Q3. Array mein kaunse type ke elements store kar sakte hain?

Answer:

Same data type ke elements.

Example:

Correct:

```java
int[] numbers = {1,2,3};
```

Wrong:

```java
int[] numbers = {1, "Hello", true};
```

---

# Day 07 Summary

Today we learned:

* What is Array?
* Why Arrays?
* Array creation
* Array indexing
* Accessing elements
* Updating elements
* Array length
* Traversing arrays using loops
* Common mistakes
* Interview questions

Next:

Array Problems (DSA Introduction)

* Sum of Array
* Maximum Element
* Minimum Element
* Linear Search

# Sum of Array

## Why?

When an array contains many values, manually adding them is not practical.

Using loops, we can calculate the total automatically.

---

## Logic

Create a variable named sum.

Start from 0.

Visit every element and keep adding it to sum.

---

## Example

Array:

10 20 30 40 50

Calculation:

0 + 10 = 10

10 + 20 = 30

30 + 30 = 60

60 + 40 = 100

100 + 50 = 150

Output:

150

---

## Formula

sum = sum + arr[i];

Why do we initialize sum with 0?

Because 0 is the identity value for addition.

When calculating a total, we need a starting point.

Example:

0 + 10 = 10
10 + 20 = 30
30 + 50 = 80

If we start with any other value, the final answer will be incorrect.

Q. What is Array Traversal?

Array Traversal is the process of visiting every element of an array one by one in order to read, print, update, or perform operations on them.

Example:

for(int i = 0; i < arr.length; i++)
{
    System.out.println(arr[i]);
}

In this example, the loop visits every element of the array exactly once.