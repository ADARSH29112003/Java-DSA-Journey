// Create:

// StringTraversalDemo.java

// Requirements:

// String language = "Java";

// Print:

// J
// a
// v
// a

public class StringTraversalDemo {
    public static void main(String[] args) 
    {
        String language = "Java";

        for( int i = 0 ; i < language.length(); i++)
        {
            System.out.println(language.charAt(i));
        }

    }
}