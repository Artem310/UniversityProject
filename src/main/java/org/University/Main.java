package org.University;

public class Main {
    public static void main(String[] args) {

        University university1 = new University(1, "Harvard University", "Harvard", 1636, StudyProfile.MEDICINE);
        System.out.println(university1);

        Student student1 = new Student("Ivan Ivanov", 1, 1, 55);
        System.out.println(student1);

    }
}