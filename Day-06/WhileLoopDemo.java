public class WhileLoopDemo {
    public static void main(String[] args) {

        System.out.println("Numbers 1 to 5");

        int i = 1;

        while(i <= 5)
        {
            System.out.println(i);
            i++;
        }

        System.out.println();

        System.out.println("Multiples of 10");

        int number = 1;

        while(number <= 5)
        {
            System.out.println(number * 10);
            number++;
        }
    }
}