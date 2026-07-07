package ternaryOperator;

public class GradeCalculator {
    public static void main(String[] args) {
        int marks = 82;
        String grade = (marks >= 90) ? "A"
                       : (marks >= 75) ? "B"
                       : (marks >= 60) ? "C"
                       : (marks >= 40) ? "D"
                       : "Fail";

        System.out.println("Grade = " + grade);
    }
    
}
