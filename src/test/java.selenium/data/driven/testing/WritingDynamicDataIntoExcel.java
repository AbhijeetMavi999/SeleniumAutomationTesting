package test.java.selenium.data.driven.testing;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingDynamicDataIntoExcel {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(
                System.getProperty("user.dir")+"\\testdata\\Testing Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many rows?");
        int noOfRows = scanner.nextInt();
        System.out.println("Enter how many columns?");
        int noOfColumns = scanner.nextInt();

        for(int r=0; r<=noOfRows; r++) {
            XSSFRow currentRow = sheet.createRow(r);
            for(int c=0; c<noOfColumns; c++) {
                XSSFCell cell = currentRow.createCell(c);
                cell.setCellValue(scanner.next());
            }
        }

        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();
    }
}
