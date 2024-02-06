package org.University;

public enum EnumStudentCompare {
    STUDENT_COMPARE_UNIVERSITY_ID(new StudentCompareUniversityID()), STUDENT_COMPARE_FULL_NAME(new StudentCompareFullName()),
    STUDENT_COMPARE_COURSE_NUMBER(new StudentCompareCourseNumber()), STUDENT_COMPARE_AVG_EXAM_SCORE(new StudentCompareAvgExamScore());

    private final StudentComparator studentComparator;

    EnumStudentCompare(StudentComparator studentComparator) {
            this.studentComparator = studentComparator;
    }

    public StudentComparator getStudentComparator() {
        return studentComparator;
    }
}
