package org.University;

public class University {

    protected String id, fullName, shortName;
    protected double yearOfFoundation;
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

    public void setMainProfile(Enum mainProfile) {
            this.mainProfile = (StudyProfile) mainProfile;
    }

}
