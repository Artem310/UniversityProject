package org.University;

public class Student {

    protected String fullName;
    protected int currentCourseNumber, universityID;
    protected float avgExamScore;

    public String getFullName() {return fullName;}
    public int getUniversityID() {return universityID;}
    public int getCurrentCourseNumber() {return currentCourseNumber;}

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public String toString() {
        return "Имя: " + fullName + ", ID университета: " + universityID + ", номер курса: " + currentCourseNumber + ", средний балл: " + avgExamScore;
    }

    public Student(String fullName, int universityID, int currentCourseNumber, float avgExamScore) {
        this.fullName = fullName;
        this.universityID = universityID;
        this.currentCourseNumber = currentCourseNumber;
        this.avgExamScore = avgExamScore;
    }

}
