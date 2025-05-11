package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Assignment5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='Wikipedia1_wikipedia-search-input']"))
                .sendKeys("Java");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        List<WebElement> links = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
        for(WebElement link: links) {
            link.click();
        }
    }
}
