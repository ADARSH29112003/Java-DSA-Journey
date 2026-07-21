// Create:

// ReverseStringDemo.java

// Requirements:

// String language = "Java";

// Output:

// avaJ

// using:

// for loop
// charAt()
// length()

public class ReverseStringDemo {
    public static void main(String[] args) {
        String language = "Java";

        for(int i = language.length() - 1; i>=0 ; i--)
        {
            System.out.print(language.charAt(i));
        }

    }
}