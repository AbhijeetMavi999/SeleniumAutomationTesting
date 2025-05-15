package test.take.screenshot;

/*
1. Full page ss
2. Specific area of the page
3. Web element
*/

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class TakeScreenShotDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // 1. Take full page screenshot
//        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//        File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
//        sourceFile.renameTo(targetFile);    // copying screenshot to target folder

        // 2. Take screenshot of specific area of the page
//        WebElement element = driver.findElement(By.xpath("//div[@class='category-grid home-page-category-grid']//div[@class='item-grid']"));
//        File sourceFile = element.getScreenshotAs(OutputType.FILE);
//        File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\specificpagearea.png");
//        sourceFile.renameTo(targetFile);    // copying screenshot to target folder

        // 3. Capturing the screenshot of specific element
        WebElement element = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File sourceFile = element.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
        sourceFile.renameTo(targetFile);    // copying screenshot to target folder

        driver.quit();
    }
}
