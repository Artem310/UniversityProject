package org.University;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
@XmlType(propOrder = {"studentList", "universityList", "statisticsList", "date"})

@XmlRootElement(name = "root")
public class ListWrapper {
    private List<Student> studentList;
    private List<University> universityList;
    private List<Statistics> statisticsList;

    @XmlElementWrapper(name = "studentsInfo")
    @XmlElement(name = "studentEntry")
    public List<Student> getStudentList() {return studentList;}
    public void setStudentList(List<Student> studentList) {this.studentList = studentList;}
    @XmlElementWrapper(name = "universitiesInfo")
    @XmlElement(name = "universityEntry")
    public List<University> getUniversityList() {return universityList;}
    public void setUniversityList(List<University> universityList) {this.universityList = universityList;}
    @XmlElementWrapper(name = "statisticsInfo")
    @XmlElement(name = "statisticEntry")
    public List<Statistics> getStatisticsList() {return statisticsList;}
    public void setStatisticsList(List<Statistics> statisticsList) {this.statisticsList = statisticsList;}

    @XmlElement(name = "processedAt")
    public String getDate() {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        return offsetDateTime.format(dateTimeFormatter);
    }

    public ListWrapper(){}
    public ListWrapper(List<Student> students, List<University> universities, List<Statistics> statistics) {
        this.studentList = students;
        this.universityList = universities;
        this.statisticsList = statistics;
    }

}
