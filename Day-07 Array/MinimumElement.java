// Create:

// MinimumElement.java

// Requirements:

// int[] numbers = {85, 90, 78, 92, 88};

// Output:

// Minimum Element: 78

public class MinimumElement {
    public static void main(String[] args) 
    {
        int[] numbers = {85, 90, 78, 92, 88};

        int minimum = numbers[0];

        // for (int i = 1; i < numbers.length; i++){
        //     if(numbers[i] < minimum)
        //         {

        //         minimum = numbers[i];

        //     }
        //     System.out.println("Minimum Element: " + minimum);
        // }

        for(int i = 1; i < numbers.length; i++)
       {
            if(numbers[i] < minimum)
         {
             minimum = numbers[i];
         }
       }

            System.out.println("Minimum Element: " + minimum);
    }
}
