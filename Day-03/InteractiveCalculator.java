import java.util.Scanner;

public class InteractiveCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter First Number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = input.nextInt();

        System.out.println();
        System.out.println("==== Calculator Result ====");

        System.out.println("Addition : " + (firstNumber + secondNumber));
        System.out.println("Subtraction    : " + (firstNumber - secondNumber));
        System.out.println("Multiplication : " + (firstNumber * secondNumber));
        System.out.println("Division: " + (firstNumber / secondNumber));

    }
}
