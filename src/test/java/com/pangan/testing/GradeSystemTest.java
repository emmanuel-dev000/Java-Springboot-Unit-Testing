package com.pangan.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeSystemTest {
    @Test
    void Test_IfGradeIs79_StudentShouldPass() {
        int studentGrade = 79;
        var gradeSystem = new GradeSystem();
        String result = gradeSystem.getGradeRemark(studentGrade);
        assertEquals(GradeSystem.STUDENT_PASSED, result);
    }

    @Test
    void Test_IfGradeIs69_StudentShouldFail() {
        int studentGrade = 69;
        var gradeSystem = new GradeSystem();
        String result = gradeSystem.getGradeRemark(studentGrade);
        assertEquals(GradeSystem.STUDENT_FAILED, result);
    }

    @Test
    void Test_IfGradeIs50_StudentShouldNotPass() {
        int studentGrade = 50;
        var gradeSystem = new GradeSystem();
        String result = gradeSystem.getGradeRemark(studentGrade);
        assertEquals(GradeSystem.STUDENT_PASSED, result);
    }

    @Test
    void Test_IfGradeIs100_StudentShouldNotFail() {
        int studentGrade = 100;
        var gradeSystem = new GradeSystem();
        String result = gradeSystem.getGradeRemark(studentGrade);
        assertEquals(GradeSystem.STUDENT_FAILED, result);
    }

    @Test
    void Test_IfGradeIsNegative1_GradeSystemShouldThrowIllegalArgumentException() {
        int studentGrade = -1;
        var gradeSystem = new GradeSystem();
        assertThrows(
                IllegalArgumentException.class,
                () -> gradeSystem.getGradeRemark(studentGrade),
                GradeSystem.NON_NEGATIVE_ERROR_MESSAGE
        );
    }
}