import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String studentName = input.nextLine();

        System.out.print("Enter your age: ");
        int studentAge = input.nextInt();

        System.out.print("Enter your height: ");
        double studentHeight = input.nextDouble();

        System.out.println();
        System.out.println("===== Student Information =====");

        System.out.println("Name   : " + studentName);
        System.out.println("Age    : " + studentAge);
        System.out.println("Height : " + studentHeight);

    }

}