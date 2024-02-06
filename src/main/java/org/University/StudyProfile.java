package org.University;

public enum StudyProfile {
    MEDICINE("Медицина"), BUILDING("Строительство"), PROGRAMMING("Программирование"),
    PHYSICS("Физика"), LINGUISTICS("Лингвистика"), MATHEMATICS("Математика");
    private String translate;
    StudyProfile(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }
}
