package org.University;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class XlsWriter {
    public void writeExcel(List<Statistics> statistics) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");

        CellStyle boldStyle = workbook.createCellStyle();
        Font boldFont = workbook.createFont();
        boldFont.setBold(true);
        boldStyle.setFont(boldFont);

        CellStyle fontSizeStyle = workbook.createCellStyle();
        Font fontSizeFont = workbook.createFont();
        fontSizeFont.setFontHeightInPoints((short) 16);
        fontSizeStyle.setFont(fontSizeFont);

        for (int i = 0; i < statistics.size() + 1; i++) {
            Row row = sheet.createRow(i);
            Cell cell;
            if (i == 0) {
                for (int k = 0; k < 5; k++) {
                    cell = row.createCell(k);
                    switch (k) {
                        case 0:
                            cell.setCellStyle(boldStyle);
                            cell.setCellStyle(fontSizeStyle);
                            cell.setCellValue("Профиль");
                            break;
                        case 1:
                            cell.setCellStyle(boldStyle);
                            cell.setCellStyle(fontSizeStyle);
                            cell.setCellValue("Средний балл");
                            break;
                        case 2:
                            cell.setCellStyle(boldStyle);
                            cell.setCellStyle(fontSizeStyle);
                            cell.setCellValue("Количество студентов");
                            break;
                        case 3:
                            cell.setCellStyle(boldStyle);
                            cell.setCellStyle(fontSizeStyle);
                            cell.setCellValue("Количество университетов");
                            break;
                        case 4:
                            cell.setCellStyle(boldStyle);
                            cell.setCellStyle(fontSizeStyle);
                            cell.setCellValue("Названия университетов");
                            break;
                    }
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    cell = row.createCell(j);

                    switch (j) {
                        case 0:
                            cell.setCellValue(statistics.get(i - 1).getStudyProfile().getTranslate());
                            break;
                        case 1:
                            cell.setCellValue(statistics.get(i - 1).getAvgScore());
                            break;
                        case 2:
                            cell.setCellValue(statistics.get(i - 1).getQuantityStudentsByProfile().get());
                            break;
                        case 3:
                            cell.setCellValue(statistics.get(i - 1).getQuantityUniversitiesByProfile());
                            break;
                        case 4:
                            cell.setCellValue(statistics.get(i - 1).getNameUniversity());
                            break;
                    }
                }
            }
        }


        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/test.xlsx");
        workbook.write(fileOutputStream);

    }
}
