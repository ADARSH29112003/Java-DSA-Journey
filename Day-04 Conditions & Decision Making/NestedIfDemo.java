public class NestedIfDemo {
    public static void main(String[] args) {

        int age = 20;
        boolean hasID = true;

        if (age >= 18) {

            if (hasID) {
                System.out.println("Entry Allowed");
            }

        }

        int attendance = 80;
        boolean feesPaid = true;

        if (attendance >= 75) {

            if (feesPaid) {
                System.out.println("Eligible For Exam");
            }

        }
    }
}