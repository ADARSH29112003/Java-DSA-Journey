//Array:

// {85, 90, 78, 92, 88}

// Output:

// Maximum Element:
// 92

public class MaximumElement {
    public static void main(String[] args) {
        int[] number = {85, 90, 78, 92, 88};

        int max = number[0];

        for (int i = 1; i < number.length; i++)
        {
            if(number[i] > max)
            {
                max = number[i];
            }
        }

        System.out.println(max);
        
    
   }
}