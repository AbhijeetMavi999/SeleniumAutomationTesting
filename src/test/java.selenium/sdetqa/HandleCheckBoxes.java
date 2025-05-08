package sdetqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // 1) select specific checkbox
//        driver.findElement(By.xpath("//input[@id='sunday']")).click();

        // 2) select all the checkboxes
        List<WebElement> checkBoxes = driver.findElements(
                By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//        for(WebElement checkBox: checkBoxes) {
//            checkBox.click();
//        }

        // select last 3 checkboxes
        for(int i=(checkBoxes.size())-3; i< checkBoxes.size(); i++) {
            checkBoxes.get(i).click();
        }

        Thread.sleep(3000);

        // Unselect checkboxes if they are selected
        for(WebElement checkBox: checkBoxes) {
            if(checkBox.isSelected()) {
                checkBox.click();
            }
        }
    }
}
