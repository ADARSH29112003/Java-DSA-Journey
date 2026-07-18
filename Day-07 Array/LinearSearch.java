// Requirements:

// int[] numbers = {10,20,30,40,50};

// int target = 40;

// Output:

// Element Found

public class LinearSearch {
    public static void main(String[] args) {
        
        int[] numbers = {10,20,30,40,50};

        int target = 40;

        boolean found = false;

        for(int i = 1; i < numbers.length; i++)
        {
            if(numbers[i] == target)
            {
                found = true;
                break;
            }
        }
        if(found)
        {
            System.out.println("Element Found");

        }
        else
        {
            System.out.println("Element not Found");
        }
    }
}