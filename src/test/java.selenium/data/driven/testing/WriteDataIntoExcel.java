package test.java.selenium.data.driven.testing;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataIntoExcel {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(
                System.getProperty("user.dir")+"\\testdata\\Testing Data.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        XSSFRow row0 = sheet.createRow(0);
        row0.createCell(0).setCellValue("BookName");
        row0.createCell(1).setCellValue("Date");
        row0.createCell(2).setCellValue("Amount");
        row0.createCell(3).setCellValue("Location");

        XSSFRow row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("JavaScript");
        row1.createCell(1).setCellValue("29-07-2019");
        row1.createCell(2).setCellValue("530");
        row1.createCell(3).setCellValue("South America");

        XSSFRow row2 = sheet.createRow(2);
        row2.createCell(0).setCellValue("Python");
        row2.createCell(1).setCellValue("29-07-2019");
        row2.createCell(2).setCellValue("339");
        row2.createCell(3).setCellValue("Europe");

        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();
    }
}
