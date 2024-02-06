package org.University;

public class ReturnComparator {
    public static StudentComparator getStudentComparator(EnumStudentCompare enumStudentCompare) {
        return switch (enumStudentCompare) {
            case STUDENT_COMPARE_UNIVERSITY_ID -> EnumStudentCompare.STUDENT_COMPARE_UNIVERSITY_ID.getStudentComparator();
            case STUDENT_COMPARE_FULL_NAME -> EnumStudentCompare.STUDENT_COMPARE_FULL_NAME.getStudentComparator();
            case STUDENT_COMPARE_COURSE_NUMBER -> EnumStudentCompare.STUDENT_COMPARE_COURSE_NUMBER.getStudentComparator();
            case STUDENT_COMPARE_AVG_EXAM_SCORE -> EnumStudentCompare.STUDENT_COMPARE_AVG_EXAM_SCORE.getStudentComparator();
        };
    }

    public static UniversityComparator getUniversityComparator(EnumUniversityCompare enumUniversityCompare) {
        return switch (enumUniversityCompare) {
            case UNIVERSITY_COMPARE_ID -> EnumUniversityCompare.UNIVERSITY_COMPARE_ID.getUniversityComparator();
            case UNIVERSITY_COMPARE_FULL_NAME -> EnumUniversityCompare.UNIVERSITY_COMPARE_FULL_NAME.getUniversityComparator();
            case UNIVERSITY_COMPARE_SHORT_NAME -> EnumUniversityCompare.UNIVERSITY_COMPARE_SHORT_NAME.getUniversityComparator();
            case UNIVERSITY_COMPARE_YEAR -> EnumUniversityCompare.UNIVERSITY_COMPARE_YEAR.getUniversityComparator();
            case UNIVERSITY_COMPARE_MAIN_PROFILE -> EnumUniversityCompare.UNIVERSITY_COMPARE_MAIN_PROFILE.getUniversityComparator();
        };
    }

    private ReturnComparator() {

    }
}
