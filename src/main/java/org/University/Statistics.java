package org.University;

public class Statistics {
    private StudyProfile studyProfile;
    private double avgScore;
    private int quantityStudentsByProfile;
    private int quantityUniversitiesByProfile;
    private String nameUniversity;

    public Statistics(StudyProfile studyProfile, double avgScore, int quantityStudentsByProfile, int quantityUniversitiesByProfile, String nameUniversity) {
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
    public int getQuantityStudentsByProfile() {
        return quantityStudentsByProfile;
    }
    public int getQuantityUniversitiesByProfile() {
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
        return studyProfile.getTranslate() + " " + avgScore + " " + quantityStudentsByProfile + " " + quantityUniversitiesByProfile + " " + nameUniversity;
    }
}
