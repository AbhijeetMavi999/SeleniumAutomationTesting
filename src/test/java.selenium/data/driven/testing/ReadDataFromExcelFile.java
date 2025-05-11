package test.java.selenium.data.driven.testing;

/*
Excel file Hierarchy:
Excel file -> Workbook -> Sheets -> Rows -> Cells

XSSFWorkbook --> workbook
XSSFSheet    --> sheet
XSSFRow      --> row
XSSFCell     --> cell
*/

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromExcelFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")
                +"\\testdata\\Testing Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int totalNumberOfRows = sheet.getLastRowNum();
        int totalNumberOfColumns = sheet.getRow(1).getLastCellNum();

        System.out.println("Total number of rows: "+totalNumberOfRows);
        System.out.println("Total number of columns: "+totalNumberOfColumns);

        for(int r=0; r<=totalNumberOfRows; r++) {
            XSSFRow currentRow = sheet.getRow(r);
            if (currentRow == null) continue;
            for(int c=0; c<totalNumberOfColumns; c++) {
                XSSFCell column = currentRow.getCell(c);
                System.out.print((column == null ? "" : column.toString()) + "\t");
            }
            System.out.println();
        }

        workbook.close();
        fileInputStream.close();
    }
}
