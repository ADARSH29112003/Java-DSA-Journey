Q. What is charAt() in Java?

charAt() is a String method used to access a character from a specific index position.

Example:

String city = "Delhi";

city.charAt(0)

Output:

D

Q. What is equals() in Java and where is it commonly used?

equals() is a String method used to compare two Strings and check whether they contain exactly the same text.

It returns:

- true if both Strings are the same
- false if they are different

Common Uses:

- Login Systems
- Password Verification
- Username Validation
- Form Validation
- Search Systems
- Authentication and Authorization

Q. What is the difference between toUpperCase() and toLowerCase() in Java?

toUpperCase() converts all characters of a String into uppercase letters.

Example:

"Delhi" → "DELHI"

toLowerCase() converts all characters of a String into lowercase letters.

Example:

"DELHI" → "delhi"

These methods are commonly used in search systems, form validation, and user input normalization.

Q. What is String Traversal in Java?

String Traversal is the process of visiting every character of a String one by one.

It is usually performed using a loop and the charAt() method.

Example:

String name = "Java";

for(int i = 0; i < name.length(); i++)
{
    System.out.println(name.charAt(i));
}

Q. What is the logic used to reverse a String in Java?

To reverse a String, we start from the last index and move backward until index 0.

We use:

- length() to find the last index
- charAt() to access characters
- a loop with i--

Example:

String text = "Java";

for(int i = text.length() - 1; i >= 0; i--)
{
    System.out.print(text.charAt(i));
}

Output:

avaJ

Q. How can you count vowels in a String in Java?

To count vowels in a String, we traverse the String character by character using a loop and charAt().

We create a counter variable initialized to 0.

For every character, we check whether it is a vowel (a, e, i, o, u).

Whenever a vowel is found, we increment the counter using count++.

After the loop finishes, the counter contains the total number of vowels present in the String.

Q. What is a Palindrome String and how can you check it in Java?

A Palindrome String is a String that reads the same forward and backward.

Examples:

- madam
- level
- racecar

To check a palindrome in Java:

1. Store the original String.
2. Create an empty String named reversed.
3. Traverse the String from last index to first index.
4. Add each character into reversed.
5. Compare original String and reversed String using equals().
6. If both Strings are equal, it is a Palindrome.
7. Otherwise, it is not a Palindrome.

Example:

String word = "level";
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