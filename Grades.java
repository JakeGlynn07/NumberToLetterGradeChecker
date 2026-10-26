import java.util.Scanner;

public class Grades {
    public static void main(String[] argv) {
        Scanner console = new Scanner (System.in);

        double totalPoints = 0;
        double totalPointsEarned = 0;
        int gradeCount = 0;

        System.out.println ("What do you want to do?");
        System.out.println ("1. Add a grade");
        System.out.println ("2. See my current grade");
        System.out.print ("Enter a number: ");

        String s = console.nextLine();
        Scanner stringScanner = new Scanner(s);
        int x = stringScanner.nextInt();
        
        if (x == 1) {
            System.out.print ("Type the total amount of points of the assignment: ");
            double newGradeTotal = Double.parseDouble(console.nextLine());
            totalPoints = totalPoints + newGradeTotal;
            System.out.println("Added...");
            System.out.print ("Type the total amount of points you earned for the assignment: ");
            double newGradeEarned = Double.parseDouble(console.nextLine());
            totalPointsEarned = totalPointsEarned + newGradeEarned;
            System.out.println("Added...");

            if (((totalPointsEarned/totalPoints) * 100) > 90) {
                System.out.println("Nice Job! You earned higher than a 90% on this assignment.");
            }



            gradeCount = gradeCount + 1;
        } else if (x == 2) {

        } else {
            System.out.println ("Please pick 1, 2, or 3");
        }









    //     double percentage = 0;

    //     Grades grades = new Grades();

    //     String letterGrade = "test";

    //     // Test the letter grades for numbers
    //     for (double i = 0; i <= 100; i++) {
    //         percentage = i;

    //         if ((percentage >= 90.0) && (percentage <= 100.0)) {
    //             letterGrade = "A";
    //         } else if ((percentage >= 80.0) && (percentage < 90.0)) {
    //             letterGrade = "B";
    //         } else if ((percentage >= 70.0) && (percentage < 80.0)) {
    //             letterGrade = "C";
    //         } else if ((percentage >= 60.0) && (percentage < 70.0)) {
    //             letterGrade = "D";
    //         } else if (percentage < 60.0) {
    //             letterGrade = "F";
    //         }

    //         System.out.println(percentage + " " + letterGrade);
    //     }
    }
}