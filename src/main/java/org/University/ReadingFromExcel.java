package org.University;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.University.StudyProfile.MEDICINE;

public class ReadingFromExcel {
    public static List<Student> getStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        String fullName = "", universityID = "";
        double currentCourseNumber = 0;
        double avgExamScore = 0;

        FileInputStream fis = new FileInputStream(new File("src/main/resources/universityInfo.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = sheet.iterator();
        iterator.next();
        while(iterator.hasNext()) {
            Row row = iterator.next();
            int numbersOfCell = row.getPhysicalNumberOfCells();
            for (int i=0; i<numbersOfCell; i++) {
                Cell cell = row.getCell(i);
                switch (i) {
                    case 0:
                        universityID = cell.getStringCellValue();
                        break;
                    case 1:
                        fullName = cell.getStringCellValue();
                        break;
                    case 2:
                        currentCourseNumber = cell.getNumericCellValue();
                        break;
                    case 3:
                        avgExamScore = cell.getNumericCellValue();
                        break;
                }
            }
            students.add(new Student(fullName,universityID, currentCourseNumber,avgExamScore));
        }
        fis.close();
        return students;
    }

    public static List<University> getUniversity() throws IOException {
        List<University> universities = new ArrayList<>();
        String id = "", fullName = "", shortName = "";
        double yearOfFoundation = 0;
        StudyProfile mainProfile = MEDICINE;

        FileInputStream fis = new FileInputStream(new File("src/main/resources/universityInfo.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(1);
        Iterator<Row> iterator = sheet.iterator();
        iterator.next();
        while(iterator.hasNext()) {
            Row row = iterator.next();
            int numbersOfCell = row.getPhysicalNumberOfCells();
            for (int i=0; i<numbersOfCell; i++) {
                Cell cell = row.getCell(i);
                switch (i) {
                    case 0:
                        id = cell.getStringCellValue();
                        break;
                    case 1:
                        fullName = cell.getStringCellValue();
                        break;
                    case 2:
                        shortName = cell.getStringCellValue();
                        break;
                    case 3:
                        yearOfFoundation = cell.getNumericCellValue();
                        break;
                    case 4:
                        mainProfile = StudyProfile.valueOf(cell.getStringCellValue());
                }
            }
            universities.add(new University(id, fullName, shortName, yearOfFoundation, mainProfile));
        }

        fis.close();
        return universities;
    }
    private ReadingFromExcel() {
        throw new AssertionError("It is forbidden to create an object");
    }
}
