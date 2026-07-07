public class Calculator {
    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 5;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;

        System.out.println("===== Simple Calculator =====");

        System.out.println("First Number  : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);

        System.out.println();

        System.out.println("Addition       : " + addition);
        System.out.println("Subtraction    : " + subtraction);
        System.out.println("Multiplication : " + multiplication);
        System.out.println("Division       : " + division);
    }
}