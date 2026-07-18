// Requirements:

// Array:
// 10, 20, 30, 40, 50

// Calculate total sum.

// Print:

// Array Sum:
// 150

public class ArraySum {
    public static void main(String[] args) {
        
        int[] num = {10, 20, 30, 40, 50};

        int Sum = 0;

        for(int i = 0; i < num.length; i++)
        {
            Sum = Sum + num[i];
        }

        System.out.println("Total Sum of an Array: " + Sum);

    }
}

