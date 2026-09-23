package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentGradeCalculatorTest {

    StudentGradeCalculator calculator = new StudentGradeCalculator();

    @Test
    void testGradeA() {
        assertEquals("A", calculator.calculateGrade(95));
    }

    @Test
    void testGradeB() {
        assertEquals("B", calculator.calculateGrade(85));
    }

    @Test
    void testGradeF() {
        assertEquals("F", calculator.calculateGrade(40));
    }
}
