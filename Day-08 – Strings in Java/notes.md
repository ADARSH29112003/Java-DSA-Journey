# Strings in Java

## What is a String?

A String is a sequence of characters used to store text data.

Example:

```java
String name = "Adarsh";
```

Output:

Adarsh

---

## Why Do We Need Strings?

Strings are used to store text such as:

- Names
- Emails
- Passwords
- Messages
- Addresses

Without Strings, storing text would require many character variables.

---

## Syntax

```java
String variableName = "Text";
```

Example:

```java
String city = "Varanasi";
```

Q. What is a String in Java?

A String is a data type used to store text data.

It stores a sequence of characters as a single value.

Example:

String name = "Adarsh";

# String Length

## What is length()?

length() returns the total number of characters inside a String.

Example:

String language = "Java";

language.length()

Output:

4

---

## Why do we use length()?

To find:

- Password length
- Username length
- Message length
- Any text length

---

## Syntax

stringVariable.length()

Example:

name.length()

Q. What is the difference between array.length and String.length()?

array.length returns the number of elements in an array.

String.length() returns the number of characters in a String.

Examples:

int[] marks = {10,20,30};

marks.length → 3

String name = "Java";

name.length() → 4

charAt() is used to access or retrieve a character from a specific index position inside a String.

Example:

String city = "Delhi";

city.charAt(0) → D

city.charAt(1) → e

city.charAt(2) → l

# charAt()

## What is charAt()?

charAt(index) is used to access a character from a specific position inside a String.

Example:

String city = "Delhi";

city.charAt(0)

Output:

D

---

## Why do we use charAt()?

We use charAt() when we need a specific character from a String.

Examples:

- First letter of a name
- Last character of a password
- Checking individual characters
- String traversal in DSA

---

## Syntax

stringVariable.charAt(index)

Example:

city.charAt(3)

Output:

h

---

## Important Rule

String indexing starts from 0.

Example:

0 1 2 3 4

D e l h i

---

## Common Mistake

city.charAt(5)

Error

Because valid indexes are:

0 1 2 3 4

# equals()

## What is equals()?

equals() is a String method used to compare two Strings.

It checks whether both Strings contain exactly the same text.

---

## Syntax

string1.equals(string2)

Example:

String a = "Java";
String b = "Java";

a.equals(b)

Output:

true

---

## Case Sensitive

String a = "Java";
String b = "JAVA";

a.equals(b)

Output:

false

Because uppercase and lowercase letters are different.

---

## Real-Life Use Cases

- Login Systems
- Password Verification
- Username Checking
- Form Validation

---

## Important Rule

equals() compares the content of Strings.

It returns:

true  → if both Strings are exactly the same

false → if they are different

Search systems use toUpperCase() or toLowerCase() to make comparisons case-insensitive.

Example:

User Input:
java

Database:
JAVA

Without conversion:
java ≠ JAVA

After conversion:
JAVA = JAVA

Match Found.