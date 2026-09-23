package com.example;

public class StudentGradeCalculator {

    public String calculateGrade(int marks) {
        if (marks >= 90)
            return "A";
        else if (marks >= 80)
            return "B";
        else if (marks >= 70)
            return "C";
        else if (marks >= 60)
            return "D";
        else
            return "F";
    }

    public static void main(String[] args) {
        StudentGradeCalculator calculator = new StudentGradeCalculator();

        System.out.println("Grade: " + calculator.calculateGrade(85));
    }
}
