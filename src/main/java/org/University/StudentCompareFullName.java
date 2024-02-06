package org.University;

import org.apache.commons.lang3.StringUtils;

public class StudentCompareFullName implements StudentComparator{

    public int compare(Student s1, Student s2) {
        return StringUtils.compare(s1.getFullName(), s2.getFullName());
    }

}
