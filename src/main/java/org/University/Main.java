package org.University;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        List<StudentComparator> studentComparators = Stream.of(EnumStudentCompare.values()).map(EnumStudentCompare::getStudentComparator).toList();
        List<UniversityComparator> universityComparators = Stream.of(EnumUniversityCompare.values()).map(EnumUniversityCompare::getUniversityComparator).toList();

        List<Student> stud = ReadingFromExcel.getStudents().stream().sorted(studentComparators.get(0)).toList();
        stud.forEach(System.out::println);
        System.out.println();
        List<University> univ = ReadingFromExcel.getUniversity().stream().sorted(universityComparators.get(0)).toList();
        univ.forEach(System.out::println);

        System.out.println();

        String jsonStud = JsonUtil.serializationStudents(stud);
        System.out.println(jsonStud);
        System.out.println();
        String jsonUniv = JsonUtil.serializationUniversities(univ);
        System.out.println(jsonUniv);

        List<Student> studentCollection = JsonUtil.deserializationStudents(jsonStud);
        List<University> universityCollection = JsonUtil.deserializationUniversities(jsonUniv);

        System.out.println("Количество элементов коллекций студентов совпадает: " + (stud.size() == studentCollection.size()));
        System.out.println("Количество элементов коллекций университетов совпадает: " + (univ.size() == universityCollection.size()));
        System.out.println();


        File file = new File("src/main/resources/test.xlsx");
        file.delete();
        List<Statistics> statistics = UtilStatistics.getStatistic(univ, stud);
        XlsWriter xlsWriter = new XlsWriter();
        xlsWriter.writeExcel(statistics);

        statistics.forEach(System.out::println);
    }

}