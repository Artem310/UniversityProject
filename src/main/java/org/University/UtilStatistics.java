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
        List<StudyProfile> profiles = universities.stream().map(University::getMainProfile).distinct().toList();
        List<Statistics> statFinal = new ArrayList<>();
        statFinal = profiles.stream().map(profile -> {
            return new Statistics(profile, 0,0,0,"");
        }).toList();

        statistics = universities.stream().map(university -> {
            return new Statistics(
                    university.getMainProfile(),
                    students.stream().filter(student -> student.getUniversityID().equals(university.getId())).mapToDouble(Student::getAvgExamScore).sum(),
                    students.stream().filter(student -> student.getUniversityID().equals(university.getId())).count(),
                    universities.stream().filter(university1 -> university1.getMainProfile().equals(university.getMainProfile())).count(),
                    universities.stream().filter(university1 -> university1.getMainProfile().equals(university.getMainProfile())).map(University::getFullName).collect(Collectors.joining(", "))
            );
        }).collect(Collectors.toList());

        List<Statistics> finalStatistics = statistics;
        statFinal = profiles.stream().map(profile -> {
            double avgScore = finalStatistics.stream().filter(fs -> fs.getStudyProfile().equals(profile)).mapToDouble(Statistics::getAvgScore).sum();
            long quantityStudentsByProfile = finalStatistics.stream().filter(fs -> fs.getStudyProfile().equals(profile)).mapToLong(Statistics::getQuantityStudentsByProfile).sum();
            long quantityUniversitiesByProfile = finalStatistics.stream().filter(fs -> fs.getStudyProfile().equals(profile)).mapToLong(Statistics::getQuantityUniversitiesByProfile).findAny().getAsLong();
            String nameUniversity = finalStatistics.stream().filter(fs -> fs.getStudyProfile().equals(profile)).map(Statistics::getNameUniversity).findFirst().get();
            return new Statistics(profile, avgScore/quantityStudentsByProfile,quantityStudentsByProfile, quantityUniversitiesByProfile, nameUniversity);
        }).toList();


        return statFinal;
    }






    private UtilStatistics() {

    }
}
