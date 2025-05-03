package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Assignment1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        /*
        1. Provide some string search for it
        2. Count number of links
        3. Click on each link using for loop
        4. Get window ID's for every browser window
        5. Close specific browser window
         */

        driver.findElement(By.xpath("//*[@id='Wikipedia1_wikipedia-search-input']"))
                .sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        List<WebElement> searchedLinks = driver.findElements(
                By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
        System.out.println("Number of Links: "+searchedLinks.size());

        for(WebElement searchLink: searchedLinks) {
            System.out.println(searchLink.getText());
            searchLink.click();
        }

        // After opening all the pages, capture windowID's
        Set<String> windowIDs = driver.getWindowHandles();

        System.out.println("Switching to each browser window and getting the titles........");
        for(String windowId: windowIDs) {
            String title = driver.switchTo().window(windowId).getTitle();
            System.out.println(title);
        }

        driver.quit();
    }
}
