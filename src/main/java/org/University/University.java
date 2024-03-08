package org.University;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UniversityEntry")
public class University {
    @XmlElement
    protected String id, fullName, shortName;
    @XmlElement
    protected double yearOfFoundation;
    @XmlElement
    protected StudyProfile mainProfile;

        public String getId() {return id;}
        public String getFullName() {return fullName;}
        public String getShortName() {return shortName;}
        public double getYearOfFoundation() {return yearOfFoundation;}
        public StudyProfile getMainProfile() {return mainProfile;}

        public String toString() {return id + ", Полное наименование:  " + fullName + ", сокращенное наименование: " + shortName + ", год основания: " +
                yearOfFoundation + ", основаной профиль:  " + mainProfile.getTranslate();}

    public University(String id, String fullName, String shortName, double yearOfFoundation, StudyProfile mainProfile) {
            this.id = id;
            this.fullName = fullName;
            this.shortName = shortName;
            this.yearOfFoundation = yearOfFoundation;
            this.mainProfile = mainProfile;
    }
    public University() {}

    public void setMainProfile(Enum mainProfile) {
            this.mainProfile = (StudyProfile) mainProfile;
    }

}
