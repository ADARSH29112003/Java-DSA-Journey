import java.util.Scanner;

public class GreetingProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String userName = input.nextLine();

        System.out.println("Hello " + userName);
    }
}