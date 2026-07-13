public class Conditions {
    public static void main(String[] args) {

        System.out.println("=== IF Statement Examples ===");

        int temperature = 35;

        if (temperature > 30) {
            System.out.println("Hot Weather");
        }

        int battery = 15;

        if (battery < 20) {
            System.out.println("Low Battery");
        }

        System.out.println();

        System.out.println("=== IF ELSE Statement Examples ===");

        int age = 16;

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        int marks = 75;

        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}