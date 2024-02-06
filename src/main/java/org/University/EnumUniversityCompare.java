package org.University;

public enum EnumUniversityCompare {
    UNIVERSITY_COMPARE_ID(new UniversityCompareID()), UNIVERSITY_COMPARE_FULL_NAME(new UniversityCompareFullName()),
    UNIVERSITY_COMPARE_SHORT_NAME(new UniversityCompareShortName()), UNIVERSITY_COMPARE_YEAR(new UniversityCompareYear()),
    UNIVERSITY_COMPARE_MAIN_PROFILE(new UniversityCompareMainProfile());

    private final UniversityComparator universityComparator;

    EnumUniversityCompare(UniversityComparator universityComparator) {
        this.universityComparator = universityComparator;

    }

    public UniversityComparator getUniversityComparator() {
        return universityComparator;
    }
}
