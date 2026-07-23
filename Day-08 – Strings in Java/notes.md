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

# Count Uppercase & Lowercase Characters

## What is it?

This concept is used to find how many uppercase and lowercase letters are present inside a String.

Example:

String text = "JavaAI";

Output:

Uppercase = 3
Lowercase = 3

---

## Why do we use it?

We use it when we need to analyze text and check letter formatting.

Examples:

- Password Validation
- Login Systems
- Form Validation
- Resume Analyzer
- Text Editors
- AI Chat Applications

---

## Logic

Create two counters:

int upperCount = 0;
int lowerCount = 0;

Visit every character of the String one by one.

If the character is uppercase:

upperCount++;

If the character is lowercase:

lowerCount++;

After checking all characters, print both counters.

---

## Useful Methods

Check Uppercase:

Character.isUpperCase(ch);

Check Lowercase:

Character.isLowerCase(ch);

These methods return:

true
false

depending on the character.

---

## Example

String:

JavaAI

Memory:

0 → J
1 → a
2 → v
3 → a
4 → A
5 → I

Final Output:

Uppercase = 3
Lowercase = 3

---

## Syntax

Character.isUpperCase(ch);

Character.isLowerCase(ch);

---

## Important Rule

Every character must be checked one by one.

That is why we use:

char ch = text.charAt(i);

inside a loop.

---

## Real-Life Use Cases

- Password Validation
- Login Systems
- User Registration Systems
- Resume Analyzers
- Search Systems
- AI Chat Applications

---

## Time Complexity

O(n)

Because every character is visited exactly once.

---

## Key Learning

- String Traversal
- Character Checking
- Character.isUpperCase()
- Character.isLowerCase()
- Counters
- Loop + charAt()
- Password Validation Logic

# Palindrome String

## What is a Palindrome?

A Palindrome is a word, text, or String that reads the same from both directions.

Forward:

madam

Backward:

madam

Since both are the same, it is a Palindrome.

Examples:

- madam
- level
- racecar
- noon

---

## Why Do We Need Palindrome?

Palindrome checking is commonly used in:

- DSA Practice Problems
- Coding Interviews
- Word Games
- Text Processing Applications
- String Manipulation Problems

It helps improve String Traversal and Logic Building skills.

---

## Logic

Step 1:

Store the original String.

Example:

String word = "level";

Step 2:

Create an empty String.

String reversed = "";

Step 3:

Traverse the String from last index to first index.

Step 4:

Keep adding characters into reversed.

Step 5:

Compare original String and reversed String using equals().

If both are equal:

Palindrome

Otherwise:

Not Palindrome

---

## Example

Original String:

level

Memory:

0 → l
1 → e
2 → v
3 → e
4 → l

Reverse Traversal:

l
le
lev
leve
level

Final:

Original = level

Reversed = level

Result:

Palindrome

---

## Syntax

String reversed = "";

for(int i = word.length() - 1; i >= 0; i--)
{
    reversed = reversed + word.charAt(i);
}

if(word.equals(reversed))
{
    System.out.println("Palindrome");
}
else
{
    System.out.println("Not Palindrome");
}

---

## Important Learning

- Reverse Traversal
- String Comparison
- String Building
- charAt()
- equals()
- length()
- Loop Traversal

---

## Common Mistake

Wrong:

word == reversed

Correct:

word.equals(reversed)

Reason:

equals() compares String content.

== compares memory references.