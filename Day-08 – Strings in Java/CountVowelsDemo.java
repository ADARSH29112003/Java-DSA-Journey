// Requirements:

// String word = "Education";

// Print:

// Total Vowels: 5

// Use:

// for loop
// charAt()
// if condition
// count variable

public class CountVowelsDemo
{
    public static void main(String[] args) 
    {
        String word = "Education";

        int count = 0;

        for(int i = 0; i < word.length() ; i++)
        {
            char ch = word.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
            )
            {
                count++;
            }
        }
        System.out.println("Total Vowels: " + count);
    }
}