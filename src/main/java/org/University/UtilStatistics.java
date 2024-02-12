package org.University;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UtilStatistics {

    public static List<Statistics> getStatistic(List<University> universities, List<Student> students) {
        List<Statistics> statistics = new ArrayList<>();
        int avhScore = 0;
        Map<String, StudyProfile> universityIDProfile = universities.stream().collect(Collectors.toMap(University::getId, University::getMainProfile));
        List<StudyProfile> studyProfiles = universities.stream().map(University::getMainProfile).distinct().toList();
        Map<StudyProfile, Integer> score = students.stream().filter()


        return statistics;
    }




    private UtilStatistics() {

    }
}
