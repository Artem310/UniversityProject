package org.University;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "StudentEntry")
@XmlType(propOrder = {"fullName", "universityID", "avgExamScore"})
public class Student {

    protected String fullName;

    protected  String universityID;

    protected double currentCourseNumber;

    protected double avgExamScore;

    @XmlElement(name = "studentName")
    public String getFullName() {return fullName;}
    @XmlElement(name = "universityID")
    public String getUniversityID() {return universityID;}
    public double getCurrentCourseNumber() {return currentCourseNumber;}
    @XmlElement(name = "avgScore")
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
    public Student() {}

}
