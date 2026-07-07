public class Operators {
    public static void main(String[] args) {
    // ==========================
    // Arithmetic Operators
    // ==========================

    System.out.println("===== Arithmetic Operators =====");

    // Example 1: Addition

    int apples = 12;
    int oranges = 8;

    System.out.println("Addition: " + (apples + oranges));

    // Example 2: Subtraction

    int walletMoney = 1000;
    int spentMoney = 350;

    System.out.println("Subtraction: " + (walletMoney - spentMoney));

    // Example 3: Multiplication

    int rows = 6;
    int columns = 4;

    System.out.println("Multiplication: " + (rows * columns));

    // Example 4: Division

    int totalStudents = 40;
    int groups = 5;

    System.out.println("Division: " + (totalStudents / groups));

    // Example 5: Modulus (Remainder)

    int chocolates = 23;
    int children = 5;

    System.out.println("Modulus: " + (chocolates % children));

    // Example 6: Integer Division

    System.out.println("9 / 2 = " + (9 / 2));

    // Example 7: Double Division

    double firstValue = 9.0;
    double secondValue = 2.0;

    System.out.println("9.0 / 2.0 = " + (firstValue / secondValue));
       // ==========================
       // Assignment Operators
       // ==========================

       System.out.println("===== Assignment Operators =====");

       // 1: += 
       int age = 20;
       age += 5;
       System.out.println("After += : " + age);

       //2: -=
       int marks = 80;
       marks -= 15;
       System.out.println("After -= : " + marks);

       //3: *= 
       int number = 10;
       number *= 3;
       System.out.println("After -= : " + number);

       //4 /=
       int value = 20;
       value /= 4;
       System.out.println("After /= : " + value);

       //5 %=
       int num = 17;
       num %= 5;
       System.out.println("After %= : " + num);

       // ==========================
       // Assignment Operators
       // ==========================

       System.out.println("\n===== Comparison Operators =====");

       int studentCount = 50;
       int classroomCapacity = 60;

       System.out.println("studentCount == classroomCapacity :" + (studentCount == classroomCapacity ));
       System.out.println("studentCount != classroomCapacity :" + (studentCount != classroomCapacity ));
       System.out.println("studentCount > classroomCapacity :" + (studentCount > classroomCapacity ));
       System.out.println("studentCount < classroomCapacity :" + (studentCount < classroomCapacity ));
       System.out.println("studentCount >= classroomCapacity :" + (studentCount >= classroomCapacity ));
       System.out.println("studentCount <= classroomCapacity :" + (studentCount <= classroomCapacity ));

       //Character Comparison

       char FirstGrade = 'A';
       char secondGrade = 'A';

       System.out.println("FirstGrade == secondGrade :" + (FirstGrade == secondGrade));

       // ==========================
       // Logical Operators
       // ==========================

       System.out.println("\n===== Logical Operators =====");

        boolean hasJavaKnowledge = true;
        boolean completedHomework = true;

        System.out.println( "hasJavaKnowledge && completedHomework : " + (hasJavaKnowledge && completedHomework));

        boolean knowsReact = false;
        boolean knowsJava = true;

        System.out.println("knowsReact || knowsJava : " + (knowsReact || knowsJava)); 

        boolean placementReady = false;

        System.out.println("!placementReady : " + (!placementReady));

        // Real-world example

        int attendancePercentage = 82;

        System.out.println("Eligible for Exam : " + (attendancePercentage >= 75 && attendancePercentage <= 100));

       
    }

}
