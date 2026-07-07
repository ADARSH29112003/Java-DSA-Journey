# Day 02 - Java Operators

## What are Operators?

Operators are symbols that perform operations on values and variables.

Examples:

+
-
*
/
%
==
&&

---

# 1. Arithmetic Operators

Used for mathematical calculations.

| Operator | Meaning |
|----------|----------|
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |
| % | Remainder (Modulus) |

Example:

```java
int apples = 10;
int oranges = 5;

System.out.println(apples + oranges);
```

---

# 2. Assignment Operators

Used to assign or update values.

| Operator | Meaning |
|----------|----------|
| = | Assign |
| += | Add and store |
| -= | Subtract and store |
| *= | Multiply and store |
| /= | Divide and store |
| %= | Remainder and store |

Example:

```java
int salary = 10000;

salary += 5000;
```

---

# 3. Comparison Operators

Used to compare values.

Result is always:

true

or

false

| Operator | Meaning |
|----------|----------|
| == | Equal To |
| != | Not Equal To |
| > | Greater Than |
| < | Less Than |
| >= | Greater Than or Equal To |
| <= | Less Than or Equal To |

Example:

```java
System.out.println(10 > 5);
```

Output:

true

---

# 4. Logical Operators

Used to combine conditions.

| Operator | Meaning |
|----------|----------|
| && | AND |
| || | OR |
| ! | NOT |

Examples:

```java
true && true
```

Output:

true

```java
true || false
```

Output:

true

```java
!true
```

Output:

false

---

# Key Learnings

- Operators perform actions on values.
- Comparison operators return boolean values.
- Logical operators combine multiple conditions.
- Variable names should be meaningful.
- Code should be readable and self-explanatory.