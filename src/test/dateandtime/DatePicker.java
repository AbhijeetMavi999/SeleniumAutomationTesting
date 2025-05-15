package test.dateandtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePicker {

    // Select future date
    static void selectFutureDate(WebDriver driver, String expectedYear, String expectedMonth, String expectedDay) {
        while(true) {
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            if(expectedYear.equals(currentYear) && expectedMonth.equals(currentMonth)) {
                break;
            }
            // for clicking on next button
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
        // Select Date
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
        for(WebElement date: dates) {
            if(date.getText().equals(expectedDay)) {
                date.click();
                break;
            }
        }
    }

    // Select past date
    static void selectPastDate(WebDriver driver, String expectedYear, String expectedMonth, String expectedDay) {
        while(true) {
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            if(expectedYear.equals(currentYear) && expectedMonth.equals(currentMonth)) {
                break;
            }
            // for clicking on previous button
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
        }
        // Select Date
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
        for(WebElement date: dates) {
            if(date.getText().equals(expectedDay)) {
                date.click();
                break;
            }
        }
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);

        // Method 1: Using sendKeys
//        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05/14/2025");     //mm/dd/yyyy

        // Method 2: Using data picker
        String expectedYear = "2027";
        String expectedMonth = "August";
        String expectedDay = "10";
        // click on input for opening calendar
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        selectFutureDate(driver, expectedYear, expectedMonth, expectedDay);

//        selectPastDate(driver, expectedYear, expectedMonth, expectedDay);
    }
}
