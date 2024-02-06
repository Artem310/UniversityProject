package org.University;

public class UniversityCompareYear implements UniversityComparator{
    @Override
    public int compare(University u1, University u2) {
        return Double.compare(u1.getYearOfFoundation(), u2.getYearOfFoundation());
    }
}
