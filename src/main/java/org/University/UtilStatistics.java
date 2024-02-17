package org.University;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

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
            Optional<Double> avgScore = Optional.of(finalStatistics.stream().filter(fs -> fs.getStudyProfile().equals(profile)).mapToDouble(Statistics::getAvgScore).sum());
            Optional<Long> quantityStudentsByProfile = Optional.of(finalStatistics.stream().filter(fs -> fs.getStudyProfile().equals(profile)).mapToLong(stat -> {return stat.getQuantityStudentsByProfile().get();}).sum());
            Optional<Long> q = quantityStudentsByProfile.map(value -> (!(value == null || value == 0)) ? value : 1L);
            long quantityUniversitiesByProfile = finalStatistics.stream().filter(fs -> fs.getStudyProfile().equals(profile)).mapToLong(Statistics::getQuantityUniversitiesByProfile).findAny().getAsLong();
            String nameUniversity = finalStatistics.stream().filter(fs -> fs.getStudyProfile().equals(profile)).map(Statistics::getNameUniversity).findFirst().get();
            BigDecimal avgScoreDecimal = BigDecimal.valueOf(avgScore.get() / q.get());
            return new Statistics(profile, avgScoreDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue(), quantityStudentsByProfile.get(), quantityUniversitiesByProfile, nameUniversity);
        }).toList();

        return statFinal;
    }

    private UtilStatistics() {

    }
}
