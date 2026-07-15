public class ContinueDemo {
    public static void main(String[] args) {

        System.out.println("Odd Numbers From 1 To 10");

        for(int i = 1; i <= 10; i++)
        {
            if(i % 2 == 0)
            {
                continue;
            }

            System.out.println(i);
        }
    }
}