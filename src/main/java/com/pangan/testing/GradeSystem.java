package com.pangan.testing;

public class GradeSystem {
    public static final String EMPTY_STRING = "";
    public static final String STUDENT_FAILED = "Student Failed";
    public static final String STUDENT_PASSED = "Student Passed";
    public static final String NON_NEGATIVE_ERROR_MESSAGE = "Grade must not be negative nor 0.";

    public boolean isGradePass(int grade) {
        if (grade <= 0)
            throw new IllegalArgumentException(NON_NEGATIVE_ERROR_MESSAGE);

        return grade >= 79;
    }

    public String getGradeRemark(int grade) {
        if (!isGradePass(grade))
            return STUDENT_FAILED;

        return STUDENT_PASSED;
    }
}
