package org.University;

import org.apache.commons.lang3.StringUtils;

public class StudentCompareUniversityID implements StudentComparator{
    @Override
    public int compare(Student s1, Student s2) {
        return StringUtils.compare(s1.getUniversityID(), s2.getUniversityID());
    }
}
