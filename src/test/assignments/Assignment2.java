package test.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td/input"));
        Thread.sleep(3000);
//        for(WebElement checkBox: checkBoxes) {
//            checkBox.click();
//        }

        for(int i=0; i< checkBoxes.size(); i++) {
            if(i < 2) {
                checkBoxes.get(i).click();
            }
        }
    }
}
