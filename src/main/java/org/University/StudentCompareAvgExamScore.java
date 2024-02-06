package org.University;

public class StudentCompareAvgExamScore implements StudentComparator{
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getAvgExamScore(), s2.getAvgExamScore());
    }
}
