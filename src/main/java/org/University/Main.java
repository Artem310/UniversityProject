package org.University;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        List<StudentComparator> studentComparators = Stream.of(EnumStudentCompare.values()).map(EnumStudentCompare::getStudentComparator).toList();
        for (StudentComparator st : studentComparators) {
            System.out.println(st);
        }
        List<UniversityComparator> universityComparators = Stream.of(EnumUniversityCompare.values()).map(EnumUniversityCompare::getUniversityComparator).toList();
        for (UniversityComparator un : universityComparators) {
            System.out.println(un);
        }



        List<Student> stud = ReadingFromExcel.getStudents().stream().sorted(studentComparators.get(0)).toList();
        stud.forEach(System.out::println);

        System.out.println();

        List<University> univ = ReadingFromExcel.getUniversity().stream().sorted(universityComparators.get(0)).toList();
        univ.forEach(System.out::println);
    }

}