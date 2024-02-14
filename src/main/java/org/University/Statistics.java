package org.University;

public class Statistics {
    private StudyProfile studyProfile;
    private double avgScore;
    private long quantityStudentsByProfile;
    private long quantityUniversitiesByProfile;
    private String nameUniversity;

    public Statistics(StudyProfile studyProfile, double avgScore, long quantityStudentsByProfile, long quantityUniversitiesByProfile, String nameUniversity) {
        this.studyProfile = studyProfile;
        this.avgScore = avgScore;
        this.quantityStudentsByProfile = quantityStudentsByProfile;
        this.quantityUniversitiesByProfile = quantityUniversitiesByProfile;
        this.nameUniversity = nameUniversity;
    }
    public StudyProfile getStudyProfile() {
        return studyProfile;
    }
    public double getAvgScore() {
        return avgScore;
    }
    public long getQuantityStudentsByProfile() {
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
        this.avgScore = avgScore;
    }
    public void setQuantityStudentsByProfile(int quantityStudentsByProfile) {
        this.quantityStudentsByProfile = quantityStudentsByProfile;
    }
    public void setQuantityUniversitiesByProfile(int quantityUniversitiesByProfile) {
        this.quantityUniversitiesByProfile = quantityUniversitiesByProfile;
    }
    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public String toString() {
        return "Профиль: " + studyProfile.getTranslate() + ", средний балл: " + avgScore + ", кол-во студентов: " + quantityStudentsByProfile + ", кол-во университетов: " + quantityUniversitiesByProfile + ", названия универов: " + nameUniversity;
    }
}
