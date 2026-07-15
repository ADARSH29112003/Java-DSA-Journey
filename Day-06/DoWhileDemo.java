public class DoWhileDemo {
    public static void main(String[] args) {

        int i = 1;

        System.out.println("Numbers 1 to 5");

        do
        {
            System.out.println(i);
            i++;
        }
        while(i <= 5);

        System.out.println();

        int number = 10;

        System.out.println("Runs At Least Once");

        do
        {
            System.out.println(number);
        }
        while(number <= 5);
    }
}