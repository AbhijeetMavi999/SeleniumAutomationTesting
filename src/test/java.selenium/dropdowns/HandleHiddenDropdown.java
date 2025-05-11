package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

public class HandleHiddenDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        // Login steps
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

        // Clicked on dropdown
        driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();        Thread.sleep(5000);


        // Select single option
//        driver.findElement(By.xpath("//span[normalize-space()='Part-Time Contract']")).click();

        // Count number of options
        List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
        System.out.println("Number of options in dropdown: "+options.size());

        for(WebElement option: options) {
            System.out.print(option.getText()+", ");
        }
    }
}
