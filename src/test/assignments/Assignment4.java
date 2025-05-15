package test.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Assignment4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // Click on PIM
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

        // click on dropdown
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div[1]/div[1]")).click();

        // count the number of options
        List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
        System.out.println("Total number of options in dropdown: "+options.size());

        // Printing the options
        for(WebElement option: options) {
            System.out.print(option.getText()+", ");
        }

        // select the option
        driver.findElement(By.xpath("//div[@role='listbox']/div[20]/span")).click();

    }
}
