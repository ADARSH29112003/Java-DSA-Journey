# Day 06 Interview Questions

## 1. What is a while Loop?

A while loop is a loop that repeatedly executes a block of code as long as a condition remains true.

Example:

```java
while(condition)
{
    // code
}
```

---

## 2. When Should We Use a while Loop?

A while loop should be used when the number of iterations is unknown.

Examples:

- User Login System
- ATM Machine
- Menu Driven Programs
- Taking Input Until User Exits

---

## 3. What is an Infinite Loop?

An infinite loop is a loop that never stops because its condition always remains true.

Example:

```java
while(true)
{
    System.out.println("Running");
}
```

---

## 4. Why is i++ Important in a Loop?

i++ updates the loop variable after each iteration.

Without updating the loop variable, the condition may never become false, resulting in an infinite loop.

---

## 5. Difference Between while and do-while

while Loop:

- Checks condition first
- May execute zero times

do-while Loop:

- Executes code first
- Checks condition afterwards
- Executes at least one time

---

## 6. What Does break Do?

The break statement immediately terminates a loop and transfers control to the code after the loop.

---

## 7. What Does continue Do?

The continue statement skips the current iteration and moves directly to the next iteration.

---

## 8. Difference Between break and continue

break:

- Stops the entire loop

continue:

- Skips only the current iteration
- Loop continues running

---

## 9. Real-Life Example of break

ATM machine:

If the card is blocked, the transaction is stopped immediately.

---

## 10. Real-Life Example of continue

Attendance system:

If one student's record is invalid, skip that record and continue checking the remaining students.