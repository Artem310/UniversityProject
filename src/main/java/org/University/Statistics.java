package org.University;

import java.math.BigDecimal;
import java.util.Optional;

public class Statistics {
    private StudyProfile studyProfile;
    private Optional<Double> avgScore;
    private Optional<Long> quantityStudentsByProfile;
    private long quantityUniversitiesByProfile;
    private String nameUniversity;

    public Statistics(StudyProfile studyProfile, double avgScore, long quantityStudentsByProfile, long quantityUniversitiesByProfile, String nameUniversity) {
        this.studyProfile = studyProfile;
        this.avgScore = Optional.of(avgScore);
        this.quantityStudentsByProfile = Optional.of(quantityStudentsByProfile);
        this.quantityUniversitiesByProfile = quantityUniversitiesByProfile;
        this.nameUniversity = nameUniversity;
    }
    public StudyProfile getStudyProfile() {
        return studyProfile;
    }
    public double getAvgScore() {
        return avgScore.get();
    }
    public Optional<Long> getQuantityStudentsByProfile() {
        return quantityStudentsByProfile;
    }
    public long getQuantityUniversitiesByProfile() {
        return quantityUniversitiesByProfile;
    }
    public String getNameUniversity() {
        return nameUniversity;
    }
    public void setStudyProfile(StudyProfile studyProfile) {
        this.studyProfile = studyProfile;
    }
    public void setAvgScore(double avgScore) {
        this.avgScore = Optional.of(avgScore);
    }
    public void setQuantityStudentsByProfile(long quantityStudentsByProfile) {
        this.quantityStudentsByProfile = Optional.of(quantityStudentsByProfile);
    }
    public void setQuantityUniversitiesByProfile(int quantityUniversitiesByProfile) {
        this.quantityUniversitiesByProfile = quantityUniversitiesByProfile;
    }
    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public String toString() {
        return "Профиль: " + studyProfile.getTranslate() + ", средний балл: " + avgScore.get() + ", кол-во студентов: " + quantityStudentsByProfile.get() + ", кол-во университетов: " + quantityUniversitiesByProfile + ", названия универов: " + nameUniversity;
    }
}
