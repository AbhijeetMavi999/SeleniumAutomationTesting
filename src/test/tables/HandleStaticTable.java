package test.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleStaticTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Find total number of rows
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        System.out.println("Total number of rows: "+tableRows.size());

        // capture the number of columns
        List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
        System.out.println("Total number of columns: "+numberOfColumns.size());
        for(WebElement column: numberOfColumns) {
            System.out.print(column.getText()+", ");
        }
        System.out.println();

        // capture data from 1st column and at 5th row
        String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
        System.out.println("1st row and at 5th columns: "+data);

        // capture book name whose author is Mukesh
//        for(int i=2; i<=tableRows.size(); i++) {
//            String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
//            if(authorName.equals("Mukesh")) {
//                String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
//                System.out.println("Book written by Mukesh: "+bookName);
//            }
//        }

        // Count the price of all books
        int totalPrice = 0;
        for(int i=2; i<=tableRows.size(); i++) {
            String price =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
            totalPrice += Integer.parseInt(price);
        }
        System.out.print("Total price of all books: "+totalPrice);
    }
}
