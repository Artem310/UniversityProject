package org.University;

import org.apache.commons.lang3.StringUtils;

public class UniversityCompareMainProfile implements UniversityComparator{
    @Override
    public int compare(University u1, University u2) {
        return StringUtils.compare(u1.getMainProfile().getTranslate(), u2.getMainProfile().getTranslate());
    }
}
