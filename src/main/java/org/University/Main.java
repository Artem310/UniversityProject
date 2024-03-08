package org.University;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.*;
import java.util.stream.Stream;

public class Main {
    static Logger loggerMain = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {

        loggerMain.log(Level.INFO, "Start program");

        List<StudentComparator> studentComparators = Stream.of(EnumStudentCompare.values()).map(EnumStudentCompare::getStudentComparator).toList();
        List<UniversityComparator> universityComparators = Stream.of(EnumUniversityCompare.values()).map(EnumUniversityCompare::getUniversityComparator).toList();

        List<Student> stud = ReadingFromExcel.getStudents().stream().sorted(studentComparators.get(0)).toList();
        List<University> univ = ReadingFromExcel.getUniversity().stream().sorted(universityComparators.get(0)).toList();

        File file = new File("src/main/resources/test.xlsx");
        file.delete();

        List<Statistics> statistics = UtilStatistics.getStatistic(univ, stud);
        XlsWriter xlsWriter = new XlsWriter();
        xlsWriter.writeExcel(statistics);

        JavaToXML.javaToXML(stud, univ, statistics);
        XMLToJson.XMLToJsonFile(new ListWrapper(stud, univ, statistics));

        loggerMain.log(Level.INFO, "End program");
    }
}