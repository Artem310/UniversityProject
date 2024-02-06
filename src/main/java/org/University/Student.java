package org.University;

public class Student {

    protected String fullName, universityID;
    protected double currentCourseNumber;
    protected double avgExamScore;

    public String getFullName() {return fullName;}
    public String getUniversityID() {return universityID;}
    public double getCurrentCourseNumber() {return currentCourseNumber;}

    public double getAvgExamScore() {
        return avgExamScore;
    }

    public String toString() {
        return "Имя: " + fullName + ", ID университета: " + universityID + ", номер курса: " + currentCourseNumber + ", средний балл: " + avgExamScore;
    }

    public Student(String fullName, String universityID, double currentCourseNumber, double avgExamScore) {
        this.fullName = fullName;
        this.universityID = universityID;
        this.currentCourseNumber = currentCourseNumber;
        this.avgExamScore = avgExamScore;
    }

}
