package org.University;

import java.util.Comparator;

public interface StudentComparator extends Comparator<Student> {
    public int compare(Student s1, Student s2);

}
