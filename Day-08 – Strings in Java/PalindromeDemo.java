public class PalindromeDemo 
{
    public static void main(String[] args) 
    {
        String word = "level";
        String reversed = "";

        for(int i = word.length() - 1; i >= 0 ; i--)
        {
            reversed = reversed + word.charAt(i);
        }
        if(word.equals(reversed))
        {
            System.out.println("Palindrome");
        }
        else
        {
            // System.out.println("It is not Palindrome");
            System.out.println("Not Palindrome");
        }
    }
}