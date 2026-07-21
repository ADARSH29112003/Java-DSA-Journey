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