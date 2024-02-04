package org.University;

public class University {

    protected String fullName, shortName;
    protected int id, yearOfFoundation;
    protected StudyProfile mainProfile;

        public int getId() {return id;}
        public String getFullName() {return fullName;}
        public String getShortName() {return shortName;}
        public int getYearOfFoundation() {return yearOfFoundation;}
        public StudyProfile getMainProfile() {return mainProfile;}

        public String toString() {return id + ", Полное наименование:  " + fullName + ", сокращенное наименование: " + shortName + ", год основания: " + yearOfFoundation + ", основаной профиль:  " + mainProfile.getTranslate();}

    public University(int id, String fullName, String shortName, int yearOfFoundation, StudyProfile mainProfile) {
            this.id = id;
            this.fullName = fullName;
            this.shortName = shortName;
            this.yearOfFoundation = yearOfFoundation;
            this.mainProfile = mainProfile;
    }

    public void setMainProfile(Enum mainProfile) {
            this.mainProfile = (StudyProfile) mainProfile;
    }

}
