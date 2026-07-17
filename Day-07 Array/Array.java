public class Array {
    public static void main (String[] args)
    {
        // 1. creating an Array
        int[] marks = {85, 90, 78, 92, 88};

        // 2. Accessing Array Element
        System.out.println("First Element:");
        System.out.println(marks[0]);

        System.out.println();

        //3. Updating Array Element

        System.out.println("Before Updating: ");
        System.out.println(marks[1]);

        marks[1] = 95;

        System.out.println("After Updating:");
        System.out.println(marks[1]);


        System.out.println();


        // 4. Finding Array Length

        System.out.println("Array Length:");
        System.out.println(marks.length);


        System.out.println();


        // 5. Traversing Array using for Loop

        System.out.println("All Elements:");

        for(int i = 0; i < marks.length; i++) {

            System.out.println(marks[i]);

        }

    }
}
