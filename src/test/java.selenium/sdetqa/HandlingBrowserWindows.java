package sdetqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandlingBrowserWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowIDs = driver.getWindowHandles();


        // Approach 1 if you have 2 or 3 window only use this approach
//        List<String> windowIDsList = new ArrayList<>(windowIDs);
//        driver.switchTo().window(windowIDsList.get(1));     // switching to child window
//        System.out.println("Current Window Title: "+driver.getTitle());
//        driver.switchTo().window(windowIDsList.get(0));     // switching to parent window
//        System.out.println("Current Window Title: "+driver.getTitle());


        // Approach 2
        for(String windowId: windowIDs) {
            String title = driver.switchTo().window(windowId).getTitle();

            if(title.equals("OrangeHRM")) {
                // Validation on this window
            } if(title.equals("Human Resources Management Software | OrangeHRM HR Software")) {
                // Validation on this window
            }
        }
    }
}
