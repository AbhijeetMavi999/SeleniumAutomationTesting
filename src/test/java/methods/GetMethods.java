package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);
//        driver.manage().window().maximize();

        System.out.println("Title of web page: "+driver.getTitle());

        System.out.println("Current URL: "+driver.getCurrentUrl());

//        System.out.println("Page Source: "+driver.getPageSource());

        // getWindowHandle() - Returns ID of the single browser window
        String windowId = driver.getWindowHandle();
        System.out.println("Window ID: "+windowId);

        // getWindowHandles() - Returns ID's of the multiple open browser windows
        driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // this will open new window
        Set<String> windowIds = driver.getWindowHandles();
        System.out.println("Window ID's: "+windowIds );
    }
}
