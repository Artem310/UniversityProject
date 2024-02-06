package org.University;

public class StudentCompareCourseNumber implements StudentComparator{
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getCurrentCourseNumber(), s2.getCurrentCourseNumber());
    }
}
