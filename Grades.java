public class Grades {
    public String checkPercentage(double percentage) {
        String letterGrade = "test";
        
        if ((percentage >= 90.0) && (percentage <= 100.0)) {
            letterGrade = "A";
        } else if ((percentage >= 80.0) && (percentage < 90.0)) {
            letterGrade = "B";
        } else if ((percentage >= 70.0) && (percentage < 80.0)) {
            letterGrade = "C";
        } else if ((percentage >= 60.0) && (percentage < 70.0)) {
            letterGrade = "D";
        } else if (percentage < 60.0) {
            letterGrade = "F";
        }

        return letterGrade;
    }





    public static void main(String[] argv) {
        Grades grades = new Grades();

        // Test the letter grades for numbers
        for (double i=1; i<=100; i=i+10) {
            String letterGrade = grades.checkPercentage(i);
            System.out.println(letterGrade);
        }
    }
}