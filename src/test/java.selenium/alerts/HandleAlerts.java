package alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // 1) Handle Normal alert with OK button
//        driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
//        Thread.sleep(3000);
//        driver.switchTo().alert().accept();     // switch to alert and accept it (means closing the alert)

        // 2) Confirmation alert - OK & Cancel
//        driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
//        Thread.sleep(3000);
//        driver.switchTo().alert().accept();     // close alert using Ok button
//        driver.switchTo().alert().dismiss();    // close alert using Cancel button

        // 3) Prompt alert - Input box
//        driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
//        Thread.sleep(3000);
//        driver.switchTo().alert().sendKeys("John Cena");
//        driver.switchTo().alert().accept();
    }
}
